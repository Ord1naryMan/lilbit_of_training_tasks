package org.bsu.example.task1.entity;

import java.util.Objects;

public class Engine {

    private final String serialNumber;
    private boolean isWorking = false;

    public Engine(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void startEngine() {
        isWorking = true;
    }

    public void stopEngine() {
        isWorking = false;
    }

    public boolean getEngineState() {
        return isWorking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(serialNumber, engine.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Engine{" +
            "serialNumber='" + serialNumber + '\'' +
            ", isWorking=" + isWorking +
            '}';
    }

}
