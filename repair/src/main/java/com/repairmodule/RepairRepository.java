package com.repairmodule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository {

    Iterable<Object> findAll();
    Repair save(Repair repair);
}
