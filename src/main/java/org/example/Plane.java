package org.example;

import java.util.List;
import java.util.Objects;

public class Plane {

    private final String serialNumber;

    private final Wing leftWing = new Wing("1");
    private final Wing rightWing = new Wing("2");
    private final LandingGear landingGear = new LandingGear("3");
    private final Engine engine = new Engine("4");
    private FlyPath flyPath;

    public Plane(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void fly() {
        engine.startEngine();
        landingGear.hideTheLandingGear();
        if (!leftWing.isWorking() || !rightWing.isWorking()) {
            throw new PlaneIsBrokenException("Wings are not ready for fly");
        }
    }

    public void setPath(FlyPath path) {
        flyPath = path;
    }

    public void displayPath() {
        System.out.println("Path: ");
        List<String> path = flyPath.getPath();
        for (int i = 0; i < path.size() - 1; i++) {
            System.out.println(
                "From: " + path.get(i) +
                " To: " + path.get(i+1)
            );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(serialNumber, plane.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Plane{" +
            "serialNumber='" + serialNumber + '\'' +
            ", leftWing=" + leftWing +
            ", rightWing=" + rightWing +
            ", landingGear=" + landingGear +
            ", engine=" + engine +
            ", flyPath=" + flyPath +
            '}';
    }
}
