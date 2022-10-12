package com.example.employeehome.mapper;

import com.example.employeehome.model.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper{
    public boolean register(User user);
    public boolean photoUpload(User user);
    public List<User> queryUserList(User user);
}