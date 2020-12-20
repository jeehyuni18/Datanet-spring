package com.example.datanetspring.persistence.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Link{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, columnDefinition = "varchar(255)")
    String standardKedcd;

    @Column(nullable = false, columnDefinition = "varchar(100)")
    String targetKedcd;

    @Column(nullable = false, columnDefinition = "varchar(100)")
    String relation;

    @Column(columnDefinition = "varchar(100)")
    String transactionAmount;




}