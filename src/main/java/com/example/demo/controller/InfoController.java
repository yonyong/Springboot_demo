package com.example.demo.controller;

import com.example.demo.pojo.Info;
import com.example.demo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class InfoController {

    @Autowired
    InfoService infoService;

    @RequestMapping("/test")
    public String test(Model model){
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        ArrayList<Info> list=infoService.queryAllInfo();
        System.out.println("--------------------");
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
