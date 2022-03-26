package com.javabycode.springboot.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String username;
    public String phone;
    public String curlat;
    public String curlng;


    // Constructor, getters and setters
}