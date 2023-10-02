package com.ontu.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("var0", "");
        model.addAttribute("var1", "X");
        model.addAttribute("var2", "");
        model.addAttribute("var3", "O");
        model.addAttribute("var4", "O");
        model.addAttribute("var5", "O");
        model.addAttribute("var6", "X");
        model.addAttribute("var7", "");
        model.addAttribute("var8", "X");
        return "index";
    }
}
