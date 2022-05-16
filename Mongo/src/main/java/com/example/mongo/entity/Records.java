package com.example.mongo.entity;


import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "pets")
public class Records {

    @Id
    private String id;
    @Field("age")
    private double age;
    @Field("name")
    private String name;
    @Field("weight")
    private double weight;
    @Field("alergies")
    private String alergies;
    @Field("breed")
    private String breed;
    @Field("type")
    private String type;
    @Field("owner")
    private String owner;

    public Records(String id, double age, String name, double weight, String alergies, String breed, String type, String owner) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.alergies = alergies;
        this.breed = breed;
        this.type = type;
        this.owner = owner;
    }
}
