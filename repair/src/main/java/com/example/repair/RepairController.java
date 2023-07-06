package com.example.repair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/repair")
    private ResponseEntity<Object> deleteRepair(@PathVariable("id") int id){
        return repairService.deleteRepair(id);
    }

    @PutMapping("/repair/{id}")
    private ResponseEntity<Object> updateRepair(@PathVariable("id") int id,@RequestBody Repair repair){
        return repairService.updateRepair(id,repair);
    }


}
