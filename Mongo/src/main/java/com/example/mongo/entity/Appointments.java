package com.example.mongo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection="appointments")
public class Appointments {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("last_name")
    private String lastName;
    @Field("pet")
    private String pet;
    @Field("date")
    private String date;
    @Field("hrs")
    private double hrs;


    public Appointments(String id, String name, String lastName, String pet, String date, double hrs) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.pet = pet;
        this.date = date;
        this.hrs = hrs;

    }
}
