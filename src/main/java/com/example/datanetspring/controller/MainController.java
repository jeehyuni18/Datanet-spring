package com.example.datanetspring.controller;

import com.example.datanetspring.controller.dto.NodeDTO;
import com.example.datanetspring.service.NodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kang")
public class MainController {
    private final NodeService nodeService;

    @GetMapping(value = "/node")
    ResponseEntity<List<NodeDTO>> getData() {
        return new ResponseEntity<>(nodeService.getNodeList(), HttpStatus.OK);
    }

    @GetMapping(value = "/finance")
    ResponseEntity<List<NodeDTO>> getFinance() {
        return new ResponseEntity<>(nodeService.getFinanceList(), HttpStatus.OK);
    }

//    @GetMapping(value = "/link")
//    ResponseEntity<List<NodeDTO>> getFinance() {
//        return new ResponseEntity<>(nodeService.getLinkList(), HttpStatus.OK);
//    }
}