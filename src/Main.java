import autoFactory.Car;
import autoFactory.CarFactory;
import autoFactory.CarsharingParking;

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
            CarFactory carFactory = new CarFactory();

            Car opel = carFactory.buildCar("111-11-110" ,40,50,1,
                    "SEDAN",false,0);
            Car ford = carFactory.buildCar("111-11-111" ,40,50,1,
                    "SEDAN",false,0);
            Car mazda = carFactory.buildCar("111-11-112" ,40,50,1,
                    "SEDAN",false,0);
            Car bmw = carFactory.buildCar("111-11-113" ,40,50,1,
                    "SEDAN",false,0);

            CarsharingParking carsharingParking = new CarsharingParking(3);

            carsharingParking.getAvailableCarsNumber();
            carsharingParking.getAvailableFreeSpacesNumber();
            carsharingParking.rentCar();
            carsharingParking.returnCar(opel);
            carsharingParking.returnCar(ford);
            carsharingParking.returnCar(mazda);
            carsharingParking.getAvailableCarsNumber();
            carsharingParking.getAvailableFreeSpacesNumber();
            carsharingParking.getCarVinByPlaceNumber(1);
            carsharingParking.getCarVinByPlaceNumber(2);
            carsharingParking.getCarVinByPlaceNumber(3);
            carsharingParking.returnCar(bmw);
            carsharingParking.rentCar();
            carsharingParking.rentCar();
            carsharingParking.getAvailableCarsNumber();
            carsharingParking.getAvailableFreeSpacesNumber();
            carsharingParking.returnCar(bmw);
            carsharingParking.getAvailableCarsNumber();
            carsharingParking.getCarVinByPlaceNumber(1);
            carsharingParking.getCarVinByPlaceNumber(2);
            carsharingParking.getCarVinByPlaceNumber(3);
            carsharingParking.rentCar();
            carsharingParking.rentCar();
            carsharingParking.getCarVinByPlaceNumber(1);
            carsharingParking.getAvailableCarsNumber();
            carsharingParking.getAvailableFreeSpacesNumber();






        }
    }
