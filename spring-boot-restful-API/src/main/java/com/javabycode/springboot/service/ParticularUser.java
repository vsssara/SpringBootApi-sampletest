package com.javabycode.springboot.service;

import com.javabycode.springboot.model.UserData;
import com.javabycode.springboot.model.UserEntity;

import java.util.List;

public interface ParticularUser
{

    List<UserData> findbymobile(String id);


}
