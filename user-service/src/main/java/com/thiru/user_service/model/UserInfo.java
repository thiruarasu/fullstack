package com.thiru.user_service.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name="userinfo")
public class UserInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String password;
	private String email;
	private Long mobile;
	private String address;
	private String city;
	
}
