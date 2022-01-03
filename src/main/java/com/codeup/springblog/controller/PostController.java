package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/")
    @ResponseBody
    public String indexPosts(){
        return "posts index page";
    }

    @GetMapping("/posts/id")
    @ResponseBody
    public String individualPosts(){
        return "view an individual post";
    }

//    @GetMapping(value = "/posts/create", method = RequestMethod.GET)
//    @ResponseBody
//    public String viewCreaPposts(){
//        return "view the form for creating a post";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String
}
