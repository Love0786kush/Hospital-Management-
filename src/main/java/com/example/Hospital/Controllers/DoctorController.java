package com.example.Hospital.Controllers;

import com.example.Hospital.Modals.Doctor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors() {
        System.out.println("Fetching all doctors");
        return List.of(); // empty list instead of null
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating doctor");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorByID(@PathVariable Long id) {
        System.out.println("Fetching doctor by id: " + id);
        return null; // replace with actual fetch logic
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        System.out.println("Deleting doctor with id: " + id);
        return "Doctor deleted with id: " + id;
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        System.out.println("Updating doctor with id: " + id);
        return doctor; // replace with actual update logic
    }
}