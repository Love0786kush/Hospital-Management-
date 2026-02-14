package com.example.Hospital.Controllers;

import com.example.Hospital.Modals.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Fetching all bills");
        return List.of(); // empty list instead of null
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating bill");
        return bill;
    }

    @GetMapping("/{id}")
    public Bill getBillByID(@PathVariable Long id) {
        System.out.println("Fetching bill by id: " + id);
        return null; // replace with actual fetch logic
    }

    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable Long id) {
        System.out.println("Deleting bill with id: " + id);
        return "Bill deleted with id: " + id;
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable Long id, @RequestBody Bill bill) {
        System.out.println("Updating bill with id: " + id);
        return bill; // replace with actual update logic
    }
}