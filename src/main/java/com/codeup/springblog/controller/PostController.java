package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String posts(){
        return "posts index page";
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postsId(){
        return "view an individual post";
    }

    @RequestMapping(value = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String postsCreate(){
        return "view the form for creating a post";
    }

//    @PostMapping("/posts/create", )
}
