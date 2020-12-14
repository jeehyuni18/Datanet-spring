package com.example.datanetspring.persistence.entity;
import lombok.*;

import javax.persistence.*;

@Entity
public class Link{
    @Id
    @Column(nullable = false, columnDefinition = "varchar(100)")
    String standardKedcd;

    @Column(nullable = false, columnDefinition = "varchar(100)")
    String targetKedcd;

    @Column(nullable = false, columnDefinition = "varchar(100)")
    String relation;

    @Column(columnDefinition = "varchar(100)")
    String transactionAmount;




}