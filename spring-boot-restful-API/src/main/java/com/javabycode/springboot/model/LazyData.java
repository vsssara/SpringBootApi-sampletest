package com.javabycode.springboot.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LazyData<E extends Serializable> implements Serializable
{
    private static final long serialVersionUID = 231983617632L;

    private transient List<E> data;

    private int totalRowCount;

    private String temp;
}
