package com.thiru.user_service.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thiru.user_service.dto.UserRequest;
import com.thiru.user_service.dto.UserResponse;
import com.thiru.user_service.model.UserInfo;
import com.thiru.user_service.serivice.UserService;
import com.thiru.user_service.util.UserNotFoundException;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200/")
public class UserController {

	private static Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest userRequest)
	{
		return new ResponseEntity<>(userService.addUser(userRequest),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<UserResponse> updateUser(@PathVariable("id") Long id,@RequestBody UserResponse userRequest) throws UserNotFoundException
	{
		return new ResponseEntity<>(userService.updateUser(id,userRequest),HttpStatus.CREATED);
	}
	
	@GetMapping("/allUsers")
	public ResponseEntity<List<UserInfo>> getAllUsers()
	{
		return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable("id") Long id) throws UserNotFoundException
	{
		return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable("id") Long id) throws UserNotFoundException
	{
		return userService.deleteUserById(id);
	}
		
}
