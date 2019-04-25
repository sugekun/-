package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper {

    void insert(AuthForm authform);
    AuthForm select(String username , String password);
}
