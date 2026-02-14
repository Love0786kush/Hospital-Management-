package com.example.Hospital.Service;

import com.example.Hospital.Modals.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments() {
        try {
            System.out.println("Into service layer: fetching all appointments");
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in getAllAppointments: " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            System.out.println("Into service layer: fetching appointment by id " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in getAppointmentById: " + e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            System.out.println("Into service layer: creating appointment");
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in createAppointment: " + e.getMessage());
            return null;
        }
    }

    public Appointment updateAppointment(Long id, Appointment updatedAppointment) {
        try {
            System.out.println("Into service layer: updating appointment with id " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in updateAppointment: " + e.getMessage());
            return null;
        }
    }

    public boolean deleteAppointment(Long id) {
        try {
            System.out.println("Into service layer: deleting appointment with id " + id);
            return false;
        } catch (Exception e) {
            System.out.println("Error msg in deleteAppointment: " + e.getMessage());
            return false;
        }
    }
}