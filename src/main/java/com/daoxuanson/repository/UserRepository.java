package com.daoxuanson.repository;

import com.daoxuanson.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUserNameAndPassword(String userName, String password);
}
