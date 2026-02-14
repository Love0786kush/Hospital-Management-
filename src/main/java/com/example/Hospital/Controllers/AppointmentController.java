package com.example.Hospital.Controllers;

import com.example.Hospital.Modals.Appointment;
import com.example.Hospital.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // GET all appointments
    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Fetching all appointments");
        return appointmentService.getAllAppointments();
    }

    // CREATE appointment
    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating appointment");
        return appointmentService.createAppointment(appointment);
    }

    // GET appointment by ID
    @GetMapping("/{id}")
    public Appointment getAppointmentByID(@PathVariable Long id) {
        System.out.println("Fetching appointment by id: " + id);
        return appointmentService.getAppointmentById(id);
    }

    // DELETE appointment
    @DeleteMapping("/{id}")
    public String deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting appointment with id: " + id);
        boolean deleted = appointmentService.deleteAppointment(id);
        return deleted ? "Appointment deleted with id: " + id
                : "Appointment not found with id: " + id;
    }

    // UPDATE appointment
    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        System.out.println("Updating appointment with id: " + id);
        return appointmentService.updateAppointment(id, appointment);
    }
}