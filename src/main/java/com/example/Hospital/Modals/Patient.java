package com.example.Hospital.Modals;

import jakarta.persistence.*;   // JPA annotations
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increment primary key
    private Long id;

    private String name;
    private String gender;
    private int age;
}