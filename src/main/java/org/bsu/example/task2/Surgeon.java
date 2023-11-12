package org.bsu.example.task2;

public abstract class Surgeon extends Employee implements Doctor {

    public Surgeon() {
    }

    public Surgeon(String id, String fullName) {
        super(id, fullName);
    }

    public abstract void doSurgery(String surgeryType,
                                   String patientId,
                                   String patientFullName);
}
