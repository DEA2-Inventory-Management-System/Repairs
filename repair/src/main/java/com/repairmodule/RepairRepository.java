package com.repairmodule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository {

    Iterable<Object> findAll();
    Repair save(Repair repair);

    Optional<Repair> findById(int id);

    void deleteById(int id);
}
