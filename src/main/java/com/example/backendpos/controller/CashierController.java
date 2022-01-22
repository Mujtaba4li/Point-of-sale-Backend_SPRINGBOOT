package com.example.backendpos.controller;


import com.example.backendpos.entity.Cashier;
import com.example.backendpos.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cashier")
@CrossOrigin
public class CashierController {

    @Autowired
    private CashierService cashierService;
    @GetMapping

    public List<Cashier> getPersons(){
        return cashierService.getCashier();}
    @GetMapping(value = "/{id}")
    public Cashier getPerson(@PathVariable int id){

        return cashierService.getCashier(id);
    }
    @PostMapping
    public Cashier addPerson(@RequestBody Cashier cashier){
        return cashierService.addCashier(cashier);
    }
    @PutMapping(value = "/{id}")
    public Cashier updatePerson(@PathVariable int id,@RequestBody Cashier cashier){
        return cashierService.updateCashier(id,cashier);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteCashier(@PathVariable int id){
        cashierService.deleteCashier(id);
    }}