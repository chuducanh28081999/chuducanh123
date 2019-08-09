//package com.daoxuanson.service.impl;
//
//import com.daoxuanson.entity.Role;
//import com.daoxuanson.entity.User;
//import com.daoxuanson.repository.UserRepository;
//import com.daoxuanson.security.CustomUserDetail;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public CustomUserDetailsService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(s);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//
//        for (Role role : user.getRoles()) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        CustomUserDetail userDetail = new CustomUserDetail(user.getUserName(), user.getPassword(), grantedAuthorities);
//
//        BeanUtils.copyProperties(userDetail, user);
//
//        return userDetail;
//    }
//}
