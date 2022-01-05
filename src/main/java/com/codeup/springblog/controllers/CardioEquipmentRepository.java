package com.codeup.springblog.controllers;

import com.codeup.springblog.models.CardioEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardioEquipmentRepository extends JpaRepository<CardioEquipment, Long> {
    CardioEquipment findByTitle(String title);
    List<CardioEquipment> findAllByTitle(String title);
}
