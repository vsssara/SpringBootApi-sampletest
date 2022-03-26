package com.javabycode.springboot.Repo;

import com.javabycode.springboot.model.UserData;
import com.javabycode.springboot.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepo extends CrudRepository<UserData, Long>
{

}
