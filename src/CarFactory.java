public class CarFactory {

    public Car buildCar(String vin, int initialTankVolume, int horsepower, int engineVolume, String carBodyType,
                        boolean isTurboEngine, int engineTurbineCount) {
        FuelSystem fuelSystem = new FuelSystem(initialTankVolume);

        IEngine engine;

        if (isTurboEngine) {
            engine = new FuelTurboEngine(horsepower, engineVolume, engineTurbineCount);
        } else {
            engine = new FuelEngine(horsepower, engineVolume);
        }

        SteelBrakeSystem steelBrakeSystem = new SteelBrakeSystem();

        FuelRunningGear fuelRunningGear = new FuelRunningGear(engine, fuelSystem, steelBrakeSystem);

        ICarBody carBody;

        if (carBodyType.equals("SEDAN")) {
            carBody = new SedanCarBody();
        } else {
            carBody = new HatchbackCarBody();
        }

        return new Car(vin, fuelRunningGear, carBody);
    }
}
