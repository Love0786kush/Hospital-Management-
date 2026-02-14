package com.example.Hospital.Service;

import com.example.Hospital.Modals.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        try {
            System.out.println("Into service layer: fetching all doctors");
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in getAllDoctors: " + e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            System.out.println("Into service layer: fetching doctor by id " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in getDoctorById: " + e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            System.out.println("Into service layer: creating doctor");
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in createDoctor: " + e.getMessage());
            return null;
        }
    }

    public Doctor updateDoctor(Long id, Doctor updatedDoctor) {
        try {
            System.out.println("Into service layer: updating doctor with id " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in updateDoctor: " + e.getMessage());
            return null;
        }
    }

    public boolean deleteDoctor(Long id) {
        try {
            System.out.println("Into service layer: deleting doctor with id " + id);
            return false;
        } catch (Exception e) {
            System.out.println("Error msg in deleteDoctor: " + e.getMessage());
            return false;
        }
    }
}