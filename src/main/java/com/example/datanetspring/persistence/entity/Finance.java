package com.example.datanetspring.persistence.entity;

import lombok.*;
import javax.persistence.*;

@Entity
public class Finance {
   // @Column(nullable = false, columnDefinition = "varchar(100)")
    @Id
    String kedcd;

   // @Column(nullable = false, columnDefinition = "varchar(10)")
    //@year
    String year;

   // @Column(columnDefinition = "varchar(100)")
   // @sales
    String sales;

  //  @operatingProfit
    Long operatingProfit;

   // @randDExpenses
    Long randDExpenses;

  //  @Column(columnDefinition = "varchar(100)")
    String settlementDate;

   // @dept
    Long dept;

  //  @net_income
    Long net_income;

  //  @equity_capital
    Long equity_capital;

  //  @assets
    Long assets;

}
