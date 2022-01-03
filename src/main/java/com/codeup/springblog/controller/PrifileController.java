package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PrifileController {

    @GetMapping("/profile/{username}")
    public String profile(@PathVariable String username, Model model) {
        model.addAttribute("viewUsername", username);
        return "profile";
    }
}
