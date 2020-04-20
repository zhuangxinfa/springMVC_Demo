package com.xinfa.controller;

import com.xinfa.domain.Account;
import com.xinfa.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "param")
public class ParamController {
    /**
     * 请求参数绑定吧数据绑定到javabean的类当中
     *浏览器的saveAccount请求的参数会自动的去寻找Account的set方法构造一个Account对象
     * @return
     */
    @RequestMapping(path =  "/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping(path = "/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * 原生serverletapi的获取
     * 想获得谁就在方法的参数上写上谁
     * @return
     */
    @RequestMapping(path = "/testServerlet")
    public String testServerlet(HttpServletRequest httpServRequest, HttpServletResponse httpServletResponse){
        System.out.println(httpServRequest);
        System.out.println(httpServletResponse);
        HttpSession httpSession = httpServRequest.getSession();
        System.out.println(httpSession);
        ServletContext servletContext = httpSession.getServletContext();
        System.out.println(servletContext);
        return "success";
    }
}
