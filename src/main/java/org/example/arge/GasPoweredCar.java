package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.cylinders = cylinders;
        this.averageKmPerLiter = avgKmPerLitre;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "GasPowered car engine is starting.";
    }

    @Override
    public String drive() {
        return "GasPowered car is drive.";
    }
}
