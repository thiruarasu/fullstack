package com.thiru.order_service.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import com.thiru.order_service.model.Sequence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "sequence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Long userId;
	private String userName;
	private String email;
	private Long mobile;
	private String address;
	private String city;

}
