package com.example.datanetspring.controller.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LinkDTO {

    String standardKedcd;

    String targetKedcd;

    String relation;

    String transactionAmount;
}
