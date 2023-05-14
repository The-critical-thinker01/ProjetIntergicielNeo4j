package com.Neo4j.intergiciel.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

//@NodeEntity
@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pays {
    @Id
//	@GeneratedValue
    private Integer id;
    private String name;
//    @Relationship(type = "send", direction = Relationship.Direction.OUTGOING)
//    private List<Transaction> transactions1;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setLibellePays(String libellePays) {
        this.name = libellePays;
    }
}