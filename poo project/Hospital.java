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

class Hospital {
    private String name;
    private String location;
    private ArrayList<HospitalBlock> blocks;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.blocks = new ArrayList<>();
    }

    public void addBlock(HospitalBlock block) {
        blocks.add(block);
    }

    public void displayBlocks() {
        for (HospitalBlock block : blocks) {
            System.out.println(block.getBlockName());
        }
    }
}
