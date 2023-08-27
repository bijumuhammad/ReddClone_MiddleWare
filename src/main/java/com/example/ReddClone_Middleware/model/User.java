package com.example.ReddClone_Middleware.model;

//import jakarta.persistence.*;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
