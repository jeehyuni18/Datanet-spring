package com.example.datanetspring.controller.dto;

import com.example.datanetspring.persistence.entity.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NodeDTO {
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
