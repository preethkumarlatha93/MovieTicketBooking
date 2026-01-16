package com.learning.movie.services;


import java.util.Optional;

import com.learning.movie.convertor.UserConvertor;
import com.learning.movie.entities.User;
import com.learning.movie.exceptions.UserExist;
import com.learning.movie.repositories.UserRepository;
import com.learning.movie.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserRequest userRequest) {
        Optional<User> users = userRepository.findByEmailId(userRequest.getEmailId());

        if (users.isPresent()) {
            throw new UserExist();
        }

       User user = UserConvertor.userDtoToUser(userRequest);

        userRepository.save(user);
        return "User Saved Successfully";
    }

}