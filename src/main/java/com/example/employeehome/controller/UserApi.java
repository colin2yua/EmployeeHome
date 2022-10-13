package com.example.employeehome.controller;

import com.example.employeehome.model.User;
import com.example.employeehome.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
//@RestController
//@RequestMapping("/user")
//@Api(tags = "用户相关接口")
@Controller
public class UserApi {
//    @Autowired
//    private UserService userService;

    @ResponseBody
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

//    @ResponseBody
//    @RequestMapping(value="/hello2",method= RequestMethod.GET)
//    public String hello2() {
//        return "Hello World22222";
//    }



//    @PostMapping(value="/register",produces = "application/json;charset=UTF-8")
////    @ApiOperation("注册或修改密码都可以使用该接口")
//    public Map register(@RequestBody User user) {
//        Map<String, Object> map = new HashMap<String, Object>();
////        Yzm yzm = new Yzm();
////        yzm.setEmail(user.getEmail());
////        yzm.setYzm(user.getYzm());
////        map = queryYzm(yzm);
//        if(map.get("desc").equals("验证成功")){
//            try {
//                userService.register(user);
//                map.put("desc", "注册成功");
//                return  map;
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//            map.put("desc", "用户名或邮箱已经存在");
//            return  map;
//        }
//        else {
//            return map;
//        }
//    }

//    @PostMapping(value="/photoUpload",produces = "application/json;charset=UTF-8")
////    @ApiOperation("头像上传的接口，需要传图片文件和(用户名/邮箱)")
//    public Map photoUpload(@RequestParam(value = "file") MultipartFile file, User user) throws IOException {
//        if(file.isEmpty()) {
//            Map<String,Object> map = new HashMap<String, Object>();
//            map.put("code", 200);
//            map.put("desc","文件为空");
//            return map;
//        }
//        else {
//            byte[] bytes = file.getBytes();
//            //System.out.println(file.getBytes());
//            user.setPhoto(bytes);
//            return userService.photoUpload(user);
//        }
//    }

}
