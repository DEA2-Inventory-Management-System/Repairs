package com.repairmodule;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity //identifies a class as an entity class
@Data
@Getter //to generate default getters and setters for private fields.
@Setter
@AllArgsConstructor //generates a constructor with one parameter for every field in the class.
@NoArgsConstructor //used to generate the no-argument constructor for a class
@Builder //produces complex builder APIs for the classes.
public class Repair {
    @Id //specifies the primary key of an entity
    @Column //enables the mapping between the entity attribute and the database column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int category;

    @Column
    private String description;

    @Column
    private int status;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String date;
}
