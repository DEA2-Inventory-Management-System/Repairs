package com.example.repair;

import com.repairmodule.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class RepairApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepairApplication.class, args);
	}

	public void run(String[] args) throws Exception {
		Repair r1 = new Repair(1, 1, "Test test", 1);
		Repair r2 = new Repair(2, 1, "Test test", 3);

		//com.repairmodule.addAll(Arrays.asList(r1,r2));
	}

}
