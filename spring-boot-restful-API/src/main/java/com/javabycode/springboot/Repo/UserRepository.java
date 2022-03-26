package com.javabycode.springboot.Repo;

import com.javabycode.springboot.model.User;
import com.javabycode.springboot.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>
{


}