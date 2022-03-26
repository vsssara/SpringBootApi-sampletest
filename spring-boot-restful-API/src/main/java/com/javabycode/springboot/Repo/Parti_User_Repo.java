package com.javabycode.springboot.Repo;

import com.javabycode.springboot.model.UserData;
import com.javabycode.springboot.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface Parti_User_Repo  extends JpaRepository<UserData, String>, JpaSpecificationExecutor<UserData> {

    @Query(value = "select p from UserData p where p.phoneno=:phoneno")
    List<UserData> findbymobile(@Param("phoneno") String mobile);

}
