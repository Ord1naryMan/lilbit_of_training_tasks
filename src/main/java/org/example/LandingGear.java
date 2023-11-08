package org.example;

import java.util.Objects;

public class LandingGear {

    private boolean isOutside = true;

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
        return isOutside == that.isOutside;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOutside);
    }

    @Override
    public String toString() {
        return "LandingGear{" +
            "isOutside=" + isOutside +
            '}';
    }
}
