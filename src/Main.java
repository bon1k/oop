import autoFactory.Car;
import autoFactory.CarFactory;
import autoFactory.CarsharingParking;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
      /*      byte b = 127;
            short s = 9644;

            long l = 2;
            boolean bol = false;
            float f = 0.1F;
            double d = 2.1;
            double d1 = 2.1E8;

            char c = '\u0006';

            System.out.println("byte " + d + " dE " + d1 + " int " );


            Car[] cars = new Car[4];
            CarFactory carFactory = new CarFactory();

            for (int j = 0; j < cars.length; j++) {
                cars[j] = carFactory.buildCar("111-11-11" + j,40,50,1,
                        "SEDAN",false,0);
                cars[j].fillUpFuel(11);
                cars[j].getCurrentFuelVolume();

            }
            cars[0] = null;
            cars[cars.length-1] = null;

            System.out.println(cars[3]);
            System.out.println("Создано автомобилей " + cars.length);*/

            CarsharingParking carsharingParking = new CarsharingParking(10);




        }
    }
