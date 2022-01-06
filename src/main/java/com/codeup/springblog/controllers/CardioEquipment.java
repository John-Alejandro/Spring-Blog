package com.codeup.springblog.controllers;

import javax.persistence.*;

@Entity
@Table(name="cardioEquipment")
public class CardioEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 50)
    private String description;

    public static void deleteTitle(long cardioEquipmentId) {
    }

    public static void deleteId(long cardioEquipmentId) {
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}