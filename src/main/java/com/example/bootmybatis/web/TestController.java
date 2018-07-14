package com.example.bootmybatis.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @Value("${users.name}")
    private String name;

    @Value("${users.age}")
    private int age;

    @RequestMapping("index")
    public Object index(Model model) {
        Map map = new HashMap<String, String>();
        map.put("namess","huyaou");
        map.put("ages", "21");
        model.addAttribute("hashmap",map);
        model.addAttribute("usd","huy");
        model.addAttribute("username",name);
        model.addAttribute("userage",age);
        return "index";
    }

    @RequestMapping("show")
    @ResponseBody
    public Object show() {
        return "my name is " + name + ",age is " + age;
    }
}