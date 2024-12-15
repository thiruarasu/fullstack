package com.thiru.user_service.serivice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thiru.user_service.dto.UserRequest;
import com.thiru.user_service.dto.UserResponse;
import com.thiru.user_service.model.UserInfo;
import com.thiru.user_service.repository.UserRepository;
import com.thiru.user_service.util.UserNotFoundException;
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	

	public UserResponse addUser(UserRequest userRequest) {
		UserInfo user=UserInfo.builder()
				.userName(userRequest.userName())
				.password(userRequest.password())
				.email(userRequest.email())
				.mobile(userRequest.mobile())
				.address(userRequest.address())
				.city(userRequest.city()).build();
		UserInfo savedUser=userRepository.save(user);
		return new UserResponse(savedUser.getUserId(),savedUser.getUserName(),savedUser.getPassword(),savedUser.getEmail(),savedUser.getMobile(),savedUser.getAddress(),savedUser.getCity());
	}



	public UserResponse updateUser(Long id, UserResponse userRequest) throws UserNotFoundException {
		Optional<UserInfo> user=userRepository.findById(id);
		
		if(user==null)
		{
		 throw new UserNotFoundException("User not found for the "+id);	
		} 
			UserInfo exuser=user.get();
			exuser.setUserId(id);
			exuser.setUserName(userRequest.userName());
			exuser.setEmail(userRequest.email());
			exuser.setMobile(userRequest.mobile());
			exuser.setAddress(userRequest.address());
			exuser.setCity(userRequest.city());
		UserInfo savedUser=userRepository.save(exuser);
		return new UserResponse(savedUser.getUserId(),savedUser.getUserName(),savedUser.getPassword(),savedUser.getEmail(),savedUser.getMobile(),savedUser.getAddress(),savedUser.getCity());
	}

	public List<UserInfo> getAllUsers() {
		return userRepository.findAll();
	}

	public UserResponse getUserById(Long id) throws UserNotFoundException {
		Optional<UserInfo> user=userRepository.findById(id);
		UserInfo userres=user.get();
		if(user==null)
		{
		 throw new UserNotFoundException("User not found for the "+id);	
		}
		return new UserResponse(userres.getUserId(),userres.getUserName(),userres.getPassword(),userres.getEmail(),userres.getMobile(),userres.getAddress(),userres.getCity()); 
	}

	public String deleteUserById(Long id) throws UserNotFoundException {
		Optional<UserInfo> user=userRepository.findById(id);
		String result="";
		if(user==null)
		{
		 throw new UserNotFoundException("User not found for the "+id);	
		}
		{
			userRepository.deleteById(id);
			result="The user Successfully delted for id "+id;
		}
		return result;
	}
}
