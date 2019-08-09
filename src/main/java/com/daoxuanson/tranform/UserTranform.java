package com.daoxuanson.tranform;

import com.daoxuanson.entity.User;
import com.daoxuanson.model.response.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserTranform {

    public UserResponse tranfromToResponse(User user) {
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(response, user);

        return response;
    }

}
