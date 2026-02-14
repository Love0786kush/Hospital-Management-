package com.example.Hospital.Service;

import com.example.Hospital.Modals.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsService {

    // GET all patients
    public List<Patient> getAllPatients() {
        try {
            System.out.println("Into service layer: fetching all patients");
            return null; // replace with actual logic later
        } catch (Exception e) {
            System.out.println("Error msg in getAllPatients: " + e.getMessage());
            return null;
        }
    }

    // GET patient by ID
    public Patient getPatientById(Long id) {
        try {
            System.out.println("Into service layer: fetching patient by id " + id);
            return null; // replace with actual logic later
        } catch (Exception e) {
            System.out.println("Error msg in getPatientById: " + e.getMessage());
            return null;
        }
    }

    // CREATE patient
    public Patient createPatient(Patient patient) {
        try {
            System.out.println("Into service layer: creating patient " );
            return null; // replace with actual logic later
        } catch (Exception e) {
            System.out.println("Error msg in createPatient: " + e.getMessage());
            return null;
        }
    }

    // UPDATE patient
    public Patient updatePatient(Long id) {
        try {
            System.out.println("Into service layer: updating patient with id " + id);
            return null; // replace with actual logic later
        } catch (Exception e) {
            System.out.println("Error msg in updatePatient: " + e.getMessage());
            return null;
        }
    }

    // DELETE patient
    public boolean deletePatient(Long id) {
        try {
            System.out.println("Into service layer: deleting patient with id " + id);
            return false; // replace with actual logic later
        } catch (Exception e) {
            System.out.println("Error msg in deletePatient: " + e.getMessage());
            return false;
        }
    }
}