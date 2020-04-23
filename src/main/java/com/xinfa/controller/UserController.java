package com.xinfa.controller;

import com.xinfa.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax执行了");
        System.out.println(user);
        //模拟查询数据库
        user.setUsername("haha");
        user.setAge(40);
        //返回查询结果
        return user;
    }
}
