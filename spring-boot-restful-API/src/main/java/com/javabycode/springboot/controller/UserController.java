package com.javabycode.springboot.controller;

import com.javabycode.springboot.Repo.Parti_User_Repo;
import com.javabycode.springboot.Repo.UserDataRepo;
import com.javabycode.springboot.Repo.UserRepository;
import com.javabycode.springboot.model.LazyData;
import com.javabycode.springboot.model.User;
import com.javabycode.springboot.model.UserData;
import com.javabycode.springboot.model.UserEntity;
import com.javabycode.springboot.service.ParticularUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDataRepo userDataRepo;

    @Autowired
    private ParticularUser particularUser;

    ArrayList<UserEntity> userdata_filtered = new ArrayList<>();


    @GetMapping
    public List<UserEntity> findAllUsers() {

        return (List<UserEntity>) userRepository.findAll();
    }


    @GetMapping("/{mobilenumber}")
    public List<UserEntity> findSomeUsers(@PathVariable String mobilenumber)
    {
        userdata_filtered.clear();

        String id= mobilenumber ;

        Boolean hhh = false;

        for(UserEntity user : (List<UserEntity>) userRepository.findAll())
        {
            if(user.getPhone().equalsIgnoreCase(id))
            {
                System.out.print("Mobile "+user.getPhone());
                userdata_filtered.add(user) ;
                hhh=true;
//                return user ;
            }
        }



        if (hhh){
            return userdata_filtered ;
        }
        else {
            return null;
        }

//        return (List<UserEntity>) userRepository.findAll();

    }

    @PostMapping
    public UserEntity saveUser(@Validated @RequestBody UserEntity user) {

        UserEntity res = userRepository.save(user) ;

        UserData fff = new UserData();
        fff.setPhoneno(res.getPhone());
        fff.setLat(res.getCurlat());
        fff.setLng(res.getCurlng());

        userDataRepo.save(fff);




        return res ;
    }
}
