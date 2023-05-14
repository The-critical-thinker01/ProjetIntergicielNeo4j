package com.Neo4j.intergiciel.repository;

import com.Neo4j.intergiciel.node.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Integer>{

    User findByName(String name);

}
