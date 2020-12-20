package com.example.datanetspring.persistence.repository.impl;

import com.example.datanetspring.persistence.entity.*;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
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
        return queryFactory.select(node)
                .from(node)
                .where(builder)
                .limit(1000)
                .fetch();
    }

    @Override
    public List<Node> getNodeListById(String[] idList) {
        QNode node = QNode.node;
        BooleanBuilder builder = new BooleanBuilder();
        try {
            Integer.parseInt(idList[0]);
            builder.and(node.kedcd.in(idList));
        } catch (Exception e) {
            builder.and(node.companyName.in(idList));
        }
        return queryFactory.selectFrom(node).where(builder).fetch();
    }

    @Override
    public List<Finance> getFinanceList() {
        QFinance finance = QFinance.finance;
        BooleanBuilder builder = new BooleanBuilder();
        return queryFactory.selectFrom(finance).where(builder).fetch();
    }

    @Override
    public List<Link> getLinkList(String[] kedcdList) {
        QLink link = QLink.link;
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(link.standardKedcd.in(kedcdList));
        return queryFactory.selectFrom(link).where(builder).distinct().fetch();
    }
}
