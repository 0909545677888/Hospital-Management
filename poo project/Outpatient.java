/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

/**
 *
 * @author PC
 */
class Outpatient extends Patient {
    private double consultationFee;

    public Outpatient(String name, int age, String id, String admissionDate, double consultationFee) {
        super(name, age, id, admissionDate);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
