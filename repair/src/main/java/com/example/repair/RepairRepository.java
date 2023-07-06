package com.example.repair;

import com.example.repair.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepairRepository extends JpaRepository<Repair,Integer>, JpaSpecificationExecutor<Repair> {
    Repair save(Repair repair);

    Repair findById(int id);

    void deleteById(int id);
}
