//package com.learning.movie.services;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.learning.movie.convertor.UserConvertor;
//import com.learning.movie.entities.User;
//import com.learning.movie.exceptions.UserExist;
//import com.learning.movie.repositories.UserRepository;
//import com.learning.movie.request.UserRequest;
//
//@Service
//public class UserService {
//
//	@Autowired
//	UserRepository userRepository;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	public String addUser(UserRequest userRequest) {
//		Optional<User> users = userRepository.findByEmailId(userRequest.getEmailId());
//
//		if (users.isPresent()) {
//			throw new UserExist();
//		}
//
//		User user = UserConvertor.userDtoToUser(userRequest,  passwordEncoder.encode("1234"));
//
//		userRepository.save(user);
//		return "User Saved Successfully";
//	}
//
//}
