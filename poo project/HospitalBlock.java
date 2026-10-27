/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

/**
 *
 * @author PC
 */
import java.util.ArrayList;

class HospitalBlock {
    private String blockName;
    private ArrayList<Patient> patients;

    public HospitalBlock(String blockName) {
        this.blockName = blockName;
        this.patients = new ArrayList<>();
    }

    public String getBlockName() {
        return blockName;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayPatients() {
        for (Patient p : patients) {
            p.displayInfo();
        }
    }
}
