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

    public double toMeters() {
        return elevation / 3.2808;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>();

        mountains.add(new Mountain("Chimborazo", "Ecuador", 20549));
        mountains.add(new Mountain("Matterhorn", "Switzerland", 14692));
        mountains.add(new Mountain("Olympus", "Greeze (Macedonia)", 9573));
        mountains.add(new Mountain("Everest", "Nepal", 29029));
        mountains.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344));
        mountains.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684));
        mountains.add(new Mountain("Zugspitze", "Switzerland", 9719));

        printMountainDetails(mountains);
        printShortestMountain(mountains);
    }

    public static void printMountainDetails(List<Mountain> mountains) {
        System.out.printf("%-30s%-25s%-15s%-15s\n", "Name", "Country", "Elevation (ft)", "Elevation (m)");
        for (Mountain mountain : mountains) {
            System.out.printf("%-30s%-25s%-15.2f%-15.2f\n", mountain.getName(), mountain.getCountry(), mountain.getElevation(), mountain.toMeters());
        }
    }
    public static void printShortestMountain(List<Mountain> mountains) {
        double minElevation = Double.MAX_VALUE;
        String shortestMountainName = "";

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