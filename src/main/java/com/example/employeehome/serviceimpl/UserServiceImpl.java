package com.example.employeehome.serviceimpl;

import com.example.employeehome.mapper.UserMapper;
import com.example.employeehome.model.User;
import com.example.employeehome.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;

    @Transactional
    public void register(User user){
        usermapper.register(user);
    }

    @Override
    public Map photoUpload(User user) {
        return null;
    }

//    @Override
//    public Map photoUpload(User user) {
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("code", 200);
//        usermapper.photoUpload(user);
//
//        //System.out.println(usermapper.queryUser(user));
//        User login =usermapper.queryUser(user);
//        map.put("data",(User)login);
//        map.put("desc","头像上传成功");
//        return map;
//    }

    public Map queryUserList(User user) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code", 200);
        List<User> list = usermapper.queryUserList(user);
        map.put("desc","查询用户成功");
        map.put("number",list.size());
        map.put("data",list);
        return map;
    }


}
