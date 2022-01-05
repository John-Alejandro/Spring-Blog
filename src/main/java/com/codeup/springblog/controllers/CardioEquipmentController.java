package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardioEquipmentController {
    private final CardioEquipmentRepository cardioEquipmentDao;

    public CardioEquipmentController(CardioEquipmentRepository cardioEquipmentDao) {
        this.cardioEquipmentDao = cardioEquipmentDao;
    }

    @GetMapping("/cardioEquipment")
    public String cardioEquipmentIndex(Model model) {
        CardioEquipment cardioEquipment;
//        cardioEquipment = cardioEquipmentDao.getTitle(title);
        model.addAttribute("CardioEquipment", cardioEquipmentDao.findAll());
        return "cardioEquipment";
    }
}
