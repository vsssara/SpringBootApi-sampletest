package com.javabycode.springboot.controller;


import com.javabycode.springboot.Repo.UserDataRepo;
import com.javabycode.springboot.model.LazyData;
import com.javabycode.springboot.model.UserData;
import com.javabycode.springboot.model.UserEntity;
import com.javabycode.springboot.service.ParticularUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/userdata")
public class UserDataController {


    @Autowired
    private UserDataRepo userDataRepo;

    @Autowired
    private ParticularUser particularUser;



    @GetMapping
    public List<UserData> findAllUsers() {
        return (List<UserData>) userDataRepo.findAll();
    }




}
