package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        /*Car car = new Car(8, "Base car");
        printResult(car);

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        printResult(mitsubishi);

        Car ford = new Ford(6, "Ford Falcon");
        printResult(ford);

        Car holden = new Holden(6, "Holden Commodore");
        printResult(holden);*/

        CarSkeleton carSkeleton = new CarSkeleton("Mercedes","C180");
        printResult(carSkeleton);
        CarSkeleton gas = new GasPoweredCar("BMW","5.20",4,100);
        printResult(gas);
        CarSkeleton electric = new ElectricCar("TOYOTA","COROLLA",150,5);
        printResult(electric);
        CarSkeleton hybrid = new HybridCar("Mitsubishi","LANCER-EVO",115,6,6);
        printResult(hybrid);
    }

    /*public static void printResult(Car car){
        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }*/

    public static void printResult(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
        carSkeleton.printSimpleName();
        if (carSkeleton instanceof GasPoweredCar ){
            System.out.println(((GasPoweredCar) carSkeleton).getAverageKmPerLiter());
            System.out.println(((GasPoweredCar) carSkeleton).getCylinders());
        } else if (carSkeleton instanceof ElectricCar) {
            System.out.println(((ElectricCar) carSkeleton).getAvgKmPerCharge());
            System.out.println(((ElectricCar) carSkeleton).getBatterySize());
        } else if(carSkeleton instanceof HybridCar){
            System.out.println(((HybridCar) carSkeleton).getAvgKmPerLiter());
            System.out.println(((HybridCar) carSkeleton).getBatterySize());
            System.out.println(((HybridCar) carSkeleton).getCylinders());
        }
    }
}