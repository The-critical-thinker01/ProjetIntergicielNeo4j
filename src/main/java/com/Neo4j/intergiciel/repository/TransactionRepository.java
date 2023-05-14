package com.Neo4j.intergiciel.repository;

import com.Neo4j.intergiciel.node.Transaction;
import com.Neo4j.intergiciel.node.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TransactionRepository extends Neo4jRepository<Transaction, Integer>{

    Transaction findByName(String name);

}
