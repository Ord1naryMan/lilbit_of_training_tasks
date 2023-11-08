package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Plane plane = new Plane("12314");
        FlyPath path;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter path for fly(enter empty string to stop):");
            String city = reader.readLine();
            if (city.isBlank()) {
                System.out.println("Enter at least something!!! Exiting");
                System.exit(1);
            }
            FlyPath.Path currentPath = FlyPath.builder();
            while (!city.isBlank()) {
                currentPath.flyTo(city);
                city = reader.readLine();
            }
            path = currentPath.build();
        }
        //also you can hardcode fly path

        plane.setPath(path);

        plane.fly();
        plane.displayPath();
    }
}