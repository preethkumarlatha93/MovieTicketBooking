package com.learning.movie.convertor;

import com.learning.movie.entities.User;
import com.learning.movie.request.UserRequest;

public class UserConvertor {
    public static User userDtoToUser(UserRequest userRequest, String password) {
        User user = User.builder()
                .name(userRequest.getName())
                .age(userRequest.getAge())
                .address(userRequest.getAddress())
                .gender(userRequest.getGender())
                .mobileNo(userRequest.getMobileNo())
                .emailId(userRequest.getEmailId())
                .password(password)
                .roles(userRequest.getRoles())
                .build();

        return user;
    }
}
