package org.bsu.example.task1.entity;

import java.util.Objects;

public class LandingGear {

    private final String serialNumber;

    private boolean isOutside = true;

    public LandingGear(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void extendTheLandingGear() {
        isOutside = true;
    }

    public void hideTheLandingGear() {
        isOutside = false;
    }

    public boolean isTheLandingGearOutside() {
        return isOutside;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandingGear that = (LandingGear) o;
        return Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "LandingGear{" +
            "serialNumber='" + serialNumber + '\'' +
            ", isOutside=" + isOutside +
            '}';
    }
}
