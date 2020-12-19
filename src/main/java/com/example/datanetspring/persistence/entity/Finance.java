package com.example.datanetspring.persistence.entity;

import lombok.*;
import javax.persistence.*;

@Entity
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String kedcd;

    String year;

    String sales;

    Long operatingProfit;

    Long randDExpenses;

    String settlementDate;

    Long dept;

    Long net_income;

    Long equity_capital;

    Long assets;

}
