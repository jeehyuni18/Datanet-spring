package com.example.datanetspring.persistence.repository.impl;

import com.example.datanetspring.persistence.entity.QNode;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.example.datanetspring.persistence.entity.Node;
import com.example.datanetspring.persistence.repository.custom.NodeRepositoryCustom;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class NodeRepositoryImpl implements NodeRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Node> getNodeList() {
        QNode node = QNode.node;
        return queryFactory.selectFrom(node).fetch();
    }
}
