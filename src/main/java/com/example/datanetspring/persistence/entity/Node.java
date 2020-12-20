package com.example.datanetspring.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Node {

    @Id
    String kedcd;
    String companyName;
    String ir;
    String industryCode;
    String industryName;
    String kind;
    String corporationNum;
    String businessNum;
    String scale;
    String publicOffering;
    String establishment;
    String product;
    String state;
    Integer zipCode;
    String addr;
    String addr_new;
    String siNm;
    String formEnterprise;
    String formEstablishment;
    Integer employee;
}



