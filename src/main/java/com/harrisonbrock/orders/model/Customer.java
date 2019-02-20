package com.harrisonbrock.orders.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "custcode")
    private long id;

    @Column(name = "custname")
    private String name;

    @Column(name = "custcity")
    private String city;

    @Column(name = "workingarea")
    private String workingArea;

    @Column(name = "custcountry")
    private String country;

    @Column(name = "grade")
    private String grade;

    @Column(name = "openingamt")
    private double openingAmt;

    @Column(name = "receiveamt")
    private double receiveAmt;

    @Column(name = "paymentamt")
    private double paymentAmt;

    @Column(name = "outstandingamt")
    private double outstandingAmt;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "agentcode")
    @JsonIgnore
    private Agent buster;

    public Customer() {
    }
}