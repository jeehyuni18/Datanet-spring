package com.example.datanetspring.controller;

import com.example.datanetspring.controller.dto.NodeDTO;
import com.example.datanetspring.service.NodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kang")
public class MainController {
    private final NodeService nodeService;

    @GetMapping
    ResponseEntity<NodeDTO> getData() {
        return new ResponseEntity(nodeService.getNodeList(), HttpStatus.OK);
    }
}
