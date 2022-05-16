package com.example.mongo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "client")
public class Client {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("last_name")
    private String lastName;
    @Field("email")
    private String email;
    @Field("phone_number")
    private String phoneNumber;
    @Field("city")
    private String city;
    @Field("address")
    private String address;



    public Client(String id, String name, String lastName, String email, String phoneNumber, String city, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.address = address;

    }
}
