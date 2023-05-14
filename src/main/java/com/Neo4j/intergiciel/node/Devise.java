package com.Neo4j.intergiciel.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

//@NodeEntity
@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Devise {
    @Id
//	@GeneratedValue
    private Integer id;
    private String libelleDevise;
//    @Relationship(type = "send", direction = Relationship.Direction.OUTGOING)
//    private List<Transaction> transactions1;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setLibelleDevise(String libelleDevise) {
        this.libelleDevise = libelleDevise;
    }
}