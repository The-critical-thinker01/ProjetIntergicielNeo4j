package com.Neo4j.intergiciel.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
//	@GeneratedValue
    private Integer id;
    private String montant;
    private String name;
    private String reponse;
    @Relationship(type = "devise", direction = Relationship.Direction.INCOMING)
    private List<Devise> devise;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setDevise(List<Devise> devise) {
        this.devise = devise;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}
