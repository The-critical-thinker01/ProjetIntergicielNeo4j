package com.Neo4j.intergiciel.node;

import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
//import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NodeEntity
@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
//    @GeneratedValue
    private Integer id;
    private String login;
    private String password;
    private String name;
    private String lastName;
    private String birthday;
    @Relationship(type = "send", direction = Relationship.Direction.OUTGOING)
    private List<Transaction> transactions1;
    @Relationship(type = "receive", direction = Relationship.Direction.INCOMING)
    private List<Transaction> transactions2;
    @Relationship(type = "City", direction = Relationship.Direction.INCOMING)
    private List<Ville> ville;
    @Relationship(type = "Contry", direction = Relationship.Direction.INCOMING)
    private List<Pays> pays;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setTransactions1(List<Transaction> transactions1) {
        this.transactions1 = transactions1;
    }

    public void setTransactions2(List<Transaction> transactions2) {
        this.transactions2 = transactions2;
    }

    public void setVille(List<Ville> ville) {
        this.ville = ville;
    }

    public void setPays(List<Pays> pays) {
        this.pays = pays;
    }
}