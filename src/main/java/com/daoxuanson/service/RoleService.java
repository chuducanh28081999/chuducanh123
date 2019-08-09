package com.daoxuanson.service;

import com.daoxuanson.entity.Role;

import java.util.List;

public interface RoleService {
    Role findOne(long id);

    List<Role> findAll();
}
