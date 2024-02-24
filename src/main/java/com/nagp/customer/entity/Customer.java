package com.nagp.customer.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", nullable = false)
    private String name;
}
