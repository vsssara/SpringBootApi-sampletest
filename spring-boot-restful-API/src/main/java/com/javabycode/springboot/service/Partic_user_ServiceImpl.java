package com.javabycode.springboot.service;

import com.javabycode.springboot.Repo.Parti_User_Repo;
import com.javabycode.springboot.model.UserData;
import com.javabycode.springboot.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ParticularUser")
public class Partic_user_ServiceImpl implements ParticularUser {

    Parti_User_Repo parti_user_repo;

    @Override
    public List<UserData> findbymobile(String mobile) {
        // TODO Auto-generated method stub
        System.out.print( "data" + parti_user_repo.findbymobile(mobile) );

        return parti_user_repo.findbymobile(mobile);
    }

}
