package com.example.backendpos.repository;

import com.example.backendpos.entity.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashierRepository extends JpaRepository<Cashier,Integer> {
}
