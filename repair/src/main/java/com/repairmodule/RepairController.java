package com.repairmodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RepairController {
    @Autowired //automatic dependency injection
    RepairService repairService;

    @PostMapping("/repair")
    private Repair saveRepair(@RequestBody Repair repair){
        return repairService.saveRepair(repair);
    }

    @GetMapping("/repair")
    private List<Repair> getRepair(){
        return repairService.getRepair();
    }


}
