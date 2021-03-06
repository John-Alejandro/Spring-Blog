package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{num1}/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int addNums(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @RequestMapping(path = "/subtract/{num1}/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int subtractNums(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    @RequestMapping(path = "/multiply/{num1}/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiplyNums(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @RequestMapping(path = "/divide/{num1}/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int divideNums(@PathVariable int num1, @PathVariable int num2) {
        return num1 / num2;
    }
}
