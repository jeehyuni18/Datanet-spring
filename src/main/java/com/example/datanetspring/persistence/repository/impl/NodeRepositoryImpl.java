package com.example.datanetspring.persistence.repository.impl;

import com.example.datanetspring.persistence.entity.*;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.example.datanetspring.persistence.repository.custom.NodeRepositoryCustom;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class NodeRepositoryImpl implements NodeRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Node> getNodeList() {
        QNode node = QNode.node;
        BooleanBuilder builder = new BooleanBuilder();
        return queryFactory.selectFrom(node).where(builder).limit(1000).fetch();
    }

    @Override
    public List<Finance> getFinanceList() {
        QFinance finance = QFinance.finance;
        BooleanBuilder builder = new BooleanBuilder();
        return queryFactory.selectFrom(finance).where(builder).fetch();
    }

    @Override
    public List<Link> getLinkList() {
        QLink link = QLink.link;
        BooleanBuilder builder = new BooleanBuilder();
        return queryFactory.selectFrom(link).where(builder).fetch();
    }
}
