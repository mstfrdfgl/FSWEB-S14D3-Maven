package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinder;


    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinder) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinder;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting hybrid engine of " + getName());
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving hybrid car");
    }

    @Override
    protected void runEngine() {
        System.out.println("Running hybrid engine of " + getName());
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", batterySize=" + batterySize +
                ", cylinder=" + cylinder +
                "} " + super.toString();
    }
}
