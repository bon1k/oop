public class Main {
    public static void main(String[] args) {
        FuelSystem fuelSystem = new FuelSystem(10);

        FuelEngine fuelEngine = new FuelEngine(50, 3);

        SteelBrakeSystem steelBrakeSystem = new SteelBrakeSystem();

        FuelRunningGear fuelRunningGear = new FuelRunningGear(fuelEngine, fuelSystem, steelBrakeSystem);

        SedanCarBody sedanCarBody = new SedanCarBody();

        Car car = new Car("VIN-123-456-789", fuelRunningGear, sedanCarBody);

        car.openDoor();
        car.closeDoor();
        car.openDoor();

        car.pressGasPedal();

        car.getCurrentFuelVolume();

        car.fillUpFuel(7);

        car.getCurrentFuelVolume();

        car.pressGasPedal();
        car.pressGasPedal();

        car.getCurrentSpeed();
        car.getCurrentFuelVolume();

        car.pressGasPedal();

        car.pressStopPedal();

        car.getCurrentSpeed();

        car.setLicensePlate("A323AT");
        car.getLicensePlate();
    }
}