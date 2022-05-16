package com.example.mongo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "previous_examinations")
public class PreviousExaminations {

    @Id
    private String id;

    @Field("date_of_examination")
    private String dateOfExamination;

    @Field("diagnosis")
    private String diagnosis;

    @Field("treatment")
    private String treatment;

    @Field("type")
    private String type;

    @Field("currency")
    private String currency;

    @Field("left")
    private double leftToPay;

    @Field("payed")
    private double payed;

    @Field("sum")
    private double sum;

    @Field("pay_date")
    private Date payDate;

    @Field("saldo")
    private double saldo;

    @Field("pet")
    private String  pet;

    public PreviousExaminations(String id, String dateOfExamination, String diagnosis, String treatment, String type, String currency, double leftToPay, double payed, double sum, Date payDate, double saldo, String pet) {
        this.id = id;
        this.dateOfExamination = dateOfExamination;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.type = type;
        this.currency = currency;
        this.leftToPay = sum - payed;
        this.payed = payed;
        this.sum = sum;
        this.payDate = payDate;
        this.saldo = Math.abs(payed-leftToPay);
        this.pet= pet;
    }
}
