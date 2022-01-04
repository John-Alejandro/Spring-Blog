package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardioEquipmentController {
    private final CardioEquipmentRepository cardioEquipmentDao;

    public CardioEquipmentController(CardioEquipmentRepository cardioEquipmentDao) {
        this.cardioEquipmentDao = cardioEquipmentDao;
    }

    @GetMapping("/cardioEquipments")
    public String cardioequipmentIndex(Model model) {
        CardioEquipment cardioEquipment = cardioEquipmentDao.getTitle(title);
        model.addAttribute("CardioEquipment", cardioEquipmentDao.findAll());
        return "cardioEquipment";
    }
}
