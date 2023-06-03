package com.repairmodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepairService {

    @Autowired
    RepairRepository repairRepository;

    public Repair saveRepair(Repair repair) {
        return repairRepository.save(repair);
    }

    public List<Repair> getRepair() {
        List<Repair> repair = new ArrayList<>();
        repairRepository.findAll().forEach(updated -> repair.add((Repair) updated));
        return repair;
    }

}
