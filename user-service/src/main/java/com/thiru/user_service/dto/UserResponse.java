package com.thiru.user_service.dto;

public record UserResponse(
		Long userId,
		String userName,
		String password,
		String email,
		Long mobile,
	String address,
	String city){

	
}
