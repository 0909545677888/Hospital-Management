/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital", "Downtown");

        HospitalBlock cardiology = new HospitalBlock("Cardiology");
        cardiology.addPatient(new Inpatient("John Doe", 45, "P001", "2025-03-20", 5, 200));
        cardiology.addPatient(new EmergencyPatient("Jane Smith", 30, "P002", "2025-03-21", 500));

        hospital.addBlock(cardiology);
        hospital.displayBlocks();
        cardiology.displayPatients();
    }
}
