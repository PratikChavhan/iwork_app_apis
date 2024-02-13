package com.demo.services;

import java.util.List;

import com.demo.payloads.UserDto;

public interface UserService {
		// user creation
		UserDto createUser(UserDto user);
		
		// user update
		UserDto updateUser(UserDto user, Integer userId);
		
		//get by id
		UserDto getUserById(Integer userId);
		
		// get all
		List<UserDto> getAllUsers();
		
		// delete by id
		void deleteUser(Integer userId);
}
