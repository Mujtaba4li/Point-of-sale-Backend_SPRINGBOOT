package com.example.backendpos.service;

import com.example.backendpos.entity.Cashier;
import com.example.backendpos.repository.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CashierService {

    @Autowired
    private CashierRepository CashierRepository;
    public List<Cashier> getCashier(){
        return CashierRepository.findAll();
    }
    public Cashier getCashier(int id){
        return CashierRepository.findById(id).orElse(null);
    }


    public Cashier addCashier(Cashier cashier){
        CashierRepository.save(cashier);
        return cashier;
    }
    public Cashier updateCashier(int id,Cashier cashier){
        cashier.setID(id);
        CashierRepository.save(cashier);
        return cashier;
    }
    public void deleteCashier(int id){
        CashierRepository.deleteById(id); }}
