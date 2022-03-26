package com.javabycode.springboot.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name =  "UserData")
public class UserData {

    public static final String TABLE_NAME= "";

    public UserData( ) {
    }

    @Id
    @Column(name = "phoneno", nullable = false)
    public String phoneno;

    @Column(name = "lat", nullable = false)
    public String lat;

    @Column(name = "lng", nullable = false)
    public String lng;




}
