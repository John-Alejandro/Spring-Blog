package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String welcome() {
        return "roll-dice/";
    }

    @PostMapping("/roll-dice/{number}")
    public String result(@PathVariable int number, Model model) {
        int random = (int) (Math.random() * 6 + 1);

        model.addAttribute("diceNumber", random);
        model.addAttribute("number", number);
        return "diceResults";
    }
}
