/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

/**
 *
 * @author PC
 */
class EmergencyPatient extends Patient {
    private double emergencyFee;

    public EmergencyPatient(String name, int age, String id, String admissionDate, double emergencyFee) {
        super(name, age, id, admissionDate);
        this.emergencyFee = emergencyFee;
    }

    @Override
    public double calculateBill() {
        return emergencyFee;
    }
}
