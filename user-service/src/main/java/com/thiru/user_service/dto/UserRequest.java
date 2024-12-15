package com.thiru.user_service.dto;

public record UserRequest(String userName,String password,String email,Long mobile,
String address, String city) {

}
