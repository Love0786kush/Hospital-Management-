package com.example.Hospital.Service;

import com.example.Hospital.Modals.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        try {
            System.out.println("Into service layer: fetching all bills");
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in getAllBills: " + e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            System.out.println("Into service layer: fetching bill by id " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in getBillById: " + e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            System.out.println("Into service layer: creating bill");
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in createBill: " + e.getMessage());
            return null;
        }
    }

    public Bill updateBill(Long id, Bill updatedBill) {
        try {
            System.out.println("Into service layer: updating bill with id " + id);
            return null;
        } catch (Exception e) {
            System.out.println("Error msg in updateBill: " + e.getMessage());
            return null;
        }
    }

    public boolean deleteBill(Long id) {
        try {
            System.out.println("Into service layer: deleting bill with id " + id);
            return false;
        } catch (Exception e) {
            System.out.println("Error msg in deleteBill: " + e.getMessage());
            return false;
        }
    }
}