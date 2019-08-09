package com.daoxuanson.service;

import com.daoxuanson.entity.User;
import com.daoxuanson.model.request.UserRequest;
import com.daoxuanson.model.response.UserResponse;

import java.util.List;

public interface UserService {
    User findUserByUserNameAndPassword(String userName, String password);
    List<User> findAll();
    User insert(UserRequest userRequest);
}
