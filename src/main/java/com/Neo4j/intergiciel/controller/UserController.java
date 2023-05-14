package com.Neo4j.intergiciel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.Neo4j.intergiciel.node.*;
import com.Neo4j.intergiciel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void purchaseOrder() {

        List<Ville> ville = new ArrayList<>();
        ville.add(new Ville(4,"Dschang"));
//        ville.add(new Ville(,"Bafoussam"));

        List<Pays> pays = new ArrayList<>();
        pays.add(new Pays(2,"Cameroun"));
//        pays.add(new Pays(3,"Tchad"));

//        transactions.add(trans);
        List<Devise> devise1 = new ArrayList<>();
        devise1.add(new Devise(4,"FCFA"));
        devise1.add(new Devise(5,"DOLLAR"));

        List<Devise> devise2 = new ArrayList<>();
        devise2.add(new Devise(5,"DOLLAR"));

        List<Transaction> transaction1 = new ArrayList<>();
        transaction1.add(new Transaction(3,"12500", "OM", "ok",devise1));

        List<Transaction> transaction2 = new ArrayList<>();
        transaction2.add(new Transaction(4,"5500", "Mobile Money", "echec",devise2));

        User user = new User();
        user.setId(2);
        user.setLogin("rolex");
        user.setPassword("yvan");
        user.setName("Ronaldo");
        user.setLastName("Sinclair");
        user.setBirthday("12/14/78");
        user.setVille(ville);
        user.setPays(pays);
        user.setTransactions1(transaction1);
        user.setTransactions2(transaction1);
        repository.save(user);

//        List<Transaction> transactions1 = new ArrayList<>();
//        transactions1.add(new Transaction("125000", "avion", "voiture"));
////        products.add(new Transaction("12500", "velo", "moto"));
//        User user1 = new User();
//        user1.setId(2);
//        user1.setLogin("qwerty");
//        user1.setPassword("qwerty");
//        user1.setName("yvan");
//        user1.setLastName("qwerty");
//        user1.setBirthday("qwerty");
//        user1.setTransactions1(transactions1);
//        user1.setTransactions2(transactions1);
//        repository.save(user1);
    }

    @GetMapping("/getOrders")
    public List<User> getPurchaseOrder() {
        return (List<User>) repository.findAll();
    }

    @GetMapping("/getInfo/{name}")
    public User getInfo(@PathVariable String name) {
        return repository.findByName(name);
    }
}

