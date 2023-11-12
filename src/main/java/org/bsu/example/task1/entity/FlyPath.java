package org.bsu.example.task1.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FlyPath {
    private final List<String> path;

    private FlyPath(List<String> path) {
        this.path = path;
    }

    public static Path flyTo(String city) {
        return new Path(city);
    }
    public static Path builder() {
        return new Path();
    }

    public List<String> getPath() {
        return Collections.unmodifiableList(path);
    }
    public String toString() {
        return path.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyPath path1 = (FlyPath) o;
        return Objects.equals(path, path1.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }

    //builder class to build path
    public static class Path {

        private final List<String> path = new ArrayList<>();

        private Path() {
        }

        private Path(String city) {
            path.add(city);
        }

        public Path flyTo(String city) {
            path.add(city);
            return this;
        }

        public FlyPath build() {
            return new FlyPath(path);
        }
    }
}
