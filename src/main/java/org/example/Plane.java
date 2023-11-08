package org.example;

import java.util.List;
import java.util.Objects;

public class Plane {

    private final Wing leftWing = new Wing();
    private final Wing rightWing = new Wing();
    private final LandingGear landingGear = new LandingGear();
    private final Engine engine = new Engine();
    private FlyPath flyPath;

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
        return Objects.equals(leftWing, plane.leftWing) && Objects.equals(rightWing, plane.rightWing) && Objects.equals(landingGear, plane.landingGear) && Objects.equals(engine, plane.engine) && Objects.equals(flyPath, plane.flyPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftWing, rightWing, landingGear, engine, flyPath);
    }

    @Override
    public String toString() {
        return "Plane{" +
            "leftWing=" + leftWing +
            ", rightWing=" + rightWing +
            ", landingGear=" + landingGear +
            ", engine=" + engine +
            ", flyPath=" + flyPath +
            '}';
    }
}
