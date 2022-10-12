package com.example.employeehome.sevice;


import com.example.employeehome.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService{
    public void register(User user);
    public Map photoUpload(User user);
    public Map queryUserList(User user);
}