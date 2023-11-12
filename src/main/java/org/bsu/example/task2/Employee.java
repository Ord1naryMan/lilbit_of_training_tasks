package org.bsu.example.task2;

public abstract class Employee {

    private String id;
    private String fullName;

    public Employee() {
    }

    public Employee(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public abstract void startWorkingDay();

    public abstract void endWorkingDay();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
