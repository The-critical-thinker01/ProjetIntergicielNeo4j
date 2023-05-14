//package com.Neo4j.intergiciel.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//
//import com.Neo4j.intergiciel.node.Devise;
//import com.Neo4j.intergiciel.node.Transaction;
//import com.Neo4j.intergiciel.repository.TransactionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Neo4j.intergiciel.node.User;
//
//@RestController
//public class TransactionController {
//    @Autowired
//    private TransactionRepository repository;
//
//    @PostConstruct
//    public void purchaseOrder() {
//        List<Devise> devises = new ArrayList<>();
//        devises.add(new Devise(1, "FCFA"));
//        Transaction transaction = new Transaction();
//        transaction.setId(1);
//        transaction.setMontant("toto");
//        transaction.setName("tata");
//        transaction.setReponse("tonton");
//        transaction.setDevise(devises);
//        repository.save(transaction);
////        return transaction;
//    }
//
//    @GetMapping("/getOrders")
//    public List<Transaction> getPurchaseOrder() {
//        return (List<Transaction>) repository.findAll();
//    }
//
//    @GetMapping("/getInfo/{name}")
//    public Transaction getInfo(@PathVariable String name) {
//        return repository.findByName(name);
//    }
//}
//
