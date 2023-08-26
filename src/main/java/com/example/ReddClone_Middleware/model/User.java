package com.example.ReddClone_Middleware.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_table")
public class User {
    @Id
    private long id;
    private String name;

}
