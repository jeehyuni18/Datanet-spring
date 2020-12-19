package com.example.datanetspring.persistence.repository.custom;

import com.example.datanetspring.persistence.entity.Finance;
import com.example.datanetspring.persistence.entity.Link;
import com.example.datanetspring.persistence.entity.Node;

import java.util.List;

public interface NodeRepositoryCustom {
    List<Node> getNodeList();
    List<Finance> getFinanceList();
    List<Link> getLinkList();
}
