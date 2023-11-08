package org.example;

import java.util.Objects;

public class Wing {

    private final String serialNumber;
    //IDK what to add here :)

    public Wing(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isWorking() {
        //idk at least something
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wing wing = (Wing) o;
        return Objects.equals(serialNumber, wing.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Wing{" +
            "serialNumber='" + serialNumber + '\'' +
            '}';
    }
}
