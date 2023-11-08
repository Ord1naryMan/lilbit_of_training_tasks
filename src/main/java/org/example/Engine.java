package org.example;

import java.util.Objects;

public class Engine {

    private boolean isWorking = false;

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
        return isWorking == engine.isWorking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWorking);
    }

    @Override
    public String toString() {
        return "Engine{" +
            "isWorking=" + isWorking +
            '}';
    }
}
