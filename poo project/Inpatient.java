/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

/**
 *
 * @author PC
 */
class Inpatient extends Patient {
    private int hospitalDays;
    private double dailyCharge;

    public Inpatient(String name, int age, String id, String admissionDate, int hospitalDays, double dailyCharge) {
        super(name, age, id, admissionDate);
        this.hospitalDays = hospitalDays;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return hospitalDays * dailyCharge;
    }
}
