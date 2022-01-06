package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CardioEquipmentController {

    private final CardioEquipmentRepository cardioEquipmentDao;

    public CardioEquipmentController(CardioEquipmentRepository cardioEquipmentDao) {
        this.cardioEquipmentDao = cardioEquipmentDao;
    }

    @GetMapping("/cardioEquipment")
    public String cardioEquipmentIndex(Model model) {
        CardioEquipment cardioEquipment;
        model.addAttribute("cardioEquipment", cardioEquipmentDao.findAll());
        return "cardioEquipment";
    }



    @PostMapping("/delete")
    public String delete(@RequestParam("Title") long cardioEquipmentTitle) {
//        CardioEquipment.deleteTitle(long cardioEquipmentTitle);
        return "cardioEquipment";
    }

    @PostMapping("/edit")
    public String edit(@RequestParam("Title") long cardioEquipmentTitle) {
//        CardioEquipment.deleteTitle(long cardioEquipmentTitle);
        return "cardioEquipment";
    }
}
