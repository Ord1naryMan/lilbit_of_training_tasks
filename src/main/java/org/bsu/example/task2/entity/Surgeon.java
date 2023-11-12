package org.bsu.example.task2.entity;

import org.bsu.example.task2.dto.SurgeryInfoDto;

public abstract class Surgeon extends Employee implements Doctor {

    public Surgeon() {
    }

    public Surgeon(String id, String fullName) {
        super(id, fullName);
    }

    public abstract void doSurgery(String patientId, String surgeryType);
}
