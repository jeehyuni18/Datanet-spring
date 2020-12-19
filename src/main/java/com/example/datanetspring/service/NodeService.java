package com.example.datanetspring.service;

import com.example.datanetspring.controller.dto.NodeDTO;
import com.example.datanetspring.persistence.entity.Node;
import com.example.datanetspring.persistence.repository.NodeRepository;
import com.example.datanetspring.service.mapper.NodeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NodeService {
    private final NodeRepository nodeRepository;
    private final NodeMapper nodeMapper;

    public List<NodeDTO> getNodeList() {
        List<Node> nodeList = nodeRepository.getNodeList();
        return nodeMapper.entityToDto(nodeList);
    }

    public List<NodeDTO> getFinanceList() {
        List<Node> nodeList = nodeRepository.getNodeList();
        return nodeMapper.entityToDto(nodeList);
    }
}
