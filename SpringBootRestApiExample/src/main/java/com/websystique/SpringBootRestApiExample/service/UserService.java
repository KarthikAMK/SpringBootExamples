package com.websystique.SpringBootRestApiExample.service;

import java.util.List;

import com.websystique.SpringBootRestApiExample.model.User;

public interface UserService {

	public List<User> findAllUsers() ;

	public User findById(long id);

	public boolean isUserExist(User user) ;

	public void saveUser(User user);

	public void updateUser(User currentUser);

	public void deleteUserById(long id);

	public void deleteAllUsers() ;

}
