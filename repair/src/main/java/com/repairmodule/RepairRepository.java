package com.repairmodule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepairRepository extends JpaRepository<Repair,Integer>, JpaSpecificationExecutor<Repair> {
    //Iterable<Object> void findAll();
    Repair save(Repair repair);

    Repair findById(int id);

    void deleteById(int id);
}
