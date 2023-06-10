/*
 File: Main.java
 Description: This is my final exam program where I need to print information about mountains without hard coding it.
 Created: Thur. June 8, 2023, 11:30 pm
 Author: Joel Perez
 personal email: jp421513@gmail.com
 school email: joelp9120@student.vvc.edu
*/
import java.util.ArrayList;
import java.util.List;

class Mountain {
    private String name;
    private String country;
    private double elevation;

    public Mountain(String name, String country, double elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getElevation() {
        return elevation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    // this is the Conversion to meters

    public double toMeters() {
        return elevation / 3.2808;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>();

        // Mountain objects that will be added to a list

        mountains.add(new Mountain("Chimborazo", "Ecuador", 20549));
        mountains.add(new Mountain("Matterhorn", "Switzerland", 14692));
        mountains.add(new Mountain("Olympus", "Greeze (Macedonia)", 9573));
        mountains.add(new Mountain("Everest", "Nepal", 29029));
        mountains.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344));
        mountains.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684));
        mountains.add(new Mountain("Zugspitze", "Switzerland", 9719));

        // Print details for all of the mountains

        printMountainDetails(mountains);

        // Print the shortest mountain

        printShortestMountain(mountains);
    }

    // Prints details of all mountains in the list

    public static void printMountainDetails(List<Mountain> mountains) {
        System.out.printf("%-30s%-25s%-15s%-15s\n", "Name", "Country", "Elevation (ft)", "Elevation (m)");

        // Iterates through the list of mountains and will print details for each one

        for (Mountain mountain : mountains) {
            System.out.printf("%-30s%-25s%-15.2f%-15.2f\n", mountain.getName(), mountain.getCountry(), mountain.getElevation(), mountain.toMeters());
        }
    }

    // prints name and elevation of the shortest mountain in list

    public static void printShortestMountain(List<Mountain> mountains) {
        double minElevation = Double.MAX_VALUE;
        String shortestMountainName = "";

        // Will iterate through the list of mountains to find the shortest one
        for (Mountain mountain : mountains) {
            if (mountain.getElevation() < minElevation) {
                minElevation = mountain.getElevation();
                shortestMountainName = mountain.getName();
            }
        }

        System.out.println("\nShortest Mountain:");
        System.out.println("Name: " + shortestMountainName);
        System.out.println("Eleation: " + minElevation + " ft");
    }
}