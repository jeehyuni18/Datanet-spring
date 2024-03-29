package com.example.datanetspring.service.mapper;

import com.example.datanetspring.controller.dto.LinkDTO;
import com.example.datanetspring.controller.dto.NodeDTO;
import com.example.datanetspring.persistence.entity.Link;
import com.example.datanetspring.persistence.entity.Node;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NodeMapper {
    List<NodeDTO> entityToDto(List<Node> techList);
    List<LinkDTO> entityLinkToDto(List<Link> techList);
}
