package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Engine starting of " + name);
    }

    public void drive() {
        System.out.println(name + " is driving the car");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine running of " + name);
    }

    public void className(){
        System.out.println(getClass());
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
