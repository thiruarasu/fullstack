package com.thiru.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
	private Long userId;
	private String userName;
	private String password;
	private String email;
	private Long mobile;
	private String address;
	private String city;
}
