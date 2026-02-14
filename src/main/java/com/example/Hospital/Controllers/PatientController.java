package com.example.Hospital.Controllers;

import com.example.Hospital.Modals.Patient;
import com.example.Hospital.Service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patients")
public class PatientController {

    @Autowired
    private PatientsService patientsService;

    @GetMapping
    public List<Patient> getAllPatients() {
        System.out.println("Fetching the patients");
        return patientsService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Creating patients");
        return patientsService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientByID(@PathVariable Long id) {
        System.out.println("Fetching patients by id");
        return patientsService.getPatientById(id);


    }

    @DeleteMapping("/{id}")
    public void deletePatients(@PathVariable long id) {
         patientsService.deletePatient(id);
    }


    @PutMapping("/{id}")
    public void updatePatients(@PathVariable long id) {
        patientsService.updatePatient(id);

    }

}
