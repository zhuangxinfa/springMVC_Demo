package com.xinfa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("anno")
public class AnnoContorller {
    @RequestMapping("/testRequestparam")
    public String testRequestparam(@RequestParam (name = "nametest") String username){
        System.out.println(username);
        return  "success";

    }
}
