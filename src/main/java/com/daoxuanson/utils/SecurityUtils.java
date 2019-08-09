//package com.daoxuanson.utils;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SecurityUtils {
//
//    public static List<String> getAuthorities(Authentication authentication) {
//        List<String> results = new ArrayList<>();
//        List<GrantedAuthority> authorities = (List<GrantedAuthority>) authentication.getAuthorities();
//
//        for (GrantedAuthority authority : authorities) {
//            results.add(authority.getAuthority());
//        }
//
//        return results;
//    }
//
//    public static String getName() {
//        return SecurityContextHolder.getContext().getAuthentication().getName();
//    }
//}
