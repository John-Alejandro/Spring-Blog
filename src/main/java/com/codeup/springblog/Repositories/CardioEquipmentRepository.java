package com.codeup.springblog.Repositories;

import com.codeup.springblog.models.CardioEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardioEquipmentRepository extends JpaRepository<CardioEquipment, Long> {
}
