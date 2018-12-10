package com.qa.service;

import java.util.Optional;

import org.bson.types.Binary;

import com.qa.persistence.domain.Comment;
import com.qa.persistence.domain.User;

public interface IUserService {

	public User createUser(User user);

	public String deleteUser(Long id);

	public Optional<User> findUserByID(Long id);

	public User updateUser(Long id, User user);

	public Iterable<User> getAllUsers();

	public User createCV(Long id, Binary CV);
	
	public User createComment(Comment comment);

}