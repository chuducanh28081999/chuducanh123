package com.daoxuanson.service.impl;

import com.daoxuanson.entity.Role;
import com.daoxuanson.entity.User;
import com.daoxuanson.model.request.UserRequest;
import com.daoxuanson.model.response.UserResponse;
import com.daoxuanson.repository.RoleRepository;
import com.daoxuanson.repository.UserRepository;
import com.daoxuanson.service.UserService;
import com.daoxuanson.tranform.UserTranform;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserTranform tranform;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserTranform tranform) {
        this.userRepository = userRepository;
        this.tranform = tranform;
    }

    @Override
    public User findUserByUserNameAndPassword(String userName, String password) {
        User user = userRepository.findUserByUserNameAndPassword(userName, password);

        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

//    public User insert(UserRequest userRequest) {
//        User user = new User();
//        BeanUtils.copyProperties(userRequest,user);
//        Set<Role> roles = new HashSet<>();
//        for (Long id: userRequest.getIds()){
//            Role role = roleRepository.findOne(id);
//            roles.add(role);
//        }
//        user.setRoles(roles);
//        userRepository.save(user);
////        roles.forEach(role->role.getUsers().add(user));
//        return user;
//    }
    public User insert(UserRequest userRequest) {
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);
        Set<Role> roles = new HashSet<Role>();
        for (Long id: userRequest.getIds()) {
            Role role = roleRepository.findOne(id);
            roles.add(role);
        }
        user.setRoles(roles);
        userRepository.save(user);

        roles.forEach(role -> role.getUsers().add(user));
        return user;
    }

}
