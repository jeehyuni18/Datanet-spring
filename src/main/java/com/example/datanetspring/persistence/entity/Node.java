package com.example.datanetspring.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Entity
public class Node {

//    @Column(nullable = false, columnDefinition = "varchar(100)")
    @Id
    String kedcd;

    //@companyName
    String companyName;

   // @Column( columnDefinition = "varchar(100)")
  //  @ir
    String ir;

  //  @Column( columnDefinition = "varchar(40)")
    String industryCode;

  //  @industryName
    String industryName;

  //  @kind
    String kind;

  //  @corporationNum
    String corporationNum;

 //   @businessNum
    String businessNum;

  //  @scale
    String scale;

   // @publicOffering
    String publicOffering;

  //  @establishment
    String establishment;

  //  @product
    String product;

  //  @state
    String state;

  //  @Column(columnDefinition = "int(11)")
 //   @zipCode
    Integer zipCode;

  //  @addr
    String addr;

  //  @addr_new
    String addr_new;

  //  @siNm
    String siNm;

  //  @formEnterprise
    String formEnterprise;

  //  @formEstablishment
    String formEstablishment;

   // @Column(columnDefinition = "int(11)")
 //  @employee
    Integer employee;


}



