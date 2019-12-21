package com.yang.mj.mj.mapper;

import com.yang.mj.mj.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USER(name,accountId,token,gmt_create,gmt_modified) VALUES(#{name},#{accountId},#{token},#{gmt_create},#{gmt_modified})")
    public void insert(User user);

}
