package com.example.datanetspring.persistence.repository;

import com.example.datanetspring.persistence.entity.Node;
import com.example.datanetspring.persistence.repository.custom.NodeRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends JpaRepository<Node,Long>, NodeRepositoryCustom {
}