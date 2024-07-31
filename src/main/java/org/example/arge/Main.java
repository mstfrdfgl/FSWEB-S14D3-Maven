package org.example.arge;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar=new GasPoweredCar("Gas Engine Car","gas engine",10,6);
        CarSkeleton electroCar=new ElectricCar("Electric Engine Car","electric engine",40,20);
        CarSkeleton hybridCar=new HybridCar("Hybrid Engine Car","hybrid engine",6,14,4);
        System.out.println(gasCar);
        System.out.println(electroCar);
        System.out.println(hybridCar);
        gasCar.startEngine();
        electroCar.drive();
        hybridCar.runEngine();
    }
}
