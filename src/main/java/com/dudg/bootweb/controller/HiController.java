package com.dudg.bootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {

    @RequestMapping("/hi")
    public String hi(){
        return "index";
    }

    @RequestMapping("userinfo")
    public String userInfo(Model model){
        model.addAttribute("id",1);
        model.addAttribute("name","one");
        model.addAttribute("sex","男");

        return "list";
    }
}
