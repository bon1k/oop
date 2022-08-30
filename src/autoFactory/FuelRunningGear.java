package autoFactory;

/**
 * Класс бензиновой ходовой части автомобиля.
 */
public class FuelRunningGear implements IRunningGear {

    /**
     * Двигатель ходовой части автомобиля.
     */
    private final IEngine engine;
    /**
     * Топливная система ходовой части автомобиля.
     */
    private final IFuelSystem fuelSystem;
    /**
     * Тормозные диски ходовой части автомобиля.
     */
    private final IBrakeSystem brakeSystem;
    /**
     * Текущая скорость ходовой части.
     */
    private int currentSpeed;

    /**
     * Конструктор ходовой части.
     *
     * @param engine      двигатель создаваемой ходовой части
     * @param fuelSystem  топливная система для создаваемой ходовой части
     * @param brakeSystem тормозные диски для создаваемой ходовой части
     */
    public FuelRunningGear(IEngine engine, IFuelSystem fuelSystem, IBrakeSystem brakeSystem) {
        this.engine = engine;
        this.fuelSystem = fuelSystem;
        this.brakeSystem = brakeSystem;

        System.out.println("Собрана ходовая часть автомобиля из двигателя, топливной системы и тормозных дисков");
    }

    /**
     * Метод ускорения ходовой части автомобиля.
     */
    @Override
    public void accelerate() {
        int engineVolume = engine.getVolume();
        boolean isFuelPushedToEngine = fuelSystem.pushFuelToEngine(engineVolume);

        if (isFuelPushedToEngine) {
            int acceleration = engine.accelerate();
            currentSpeed = currentSpeed + acceleration;
        }
    }

    /**
     * Метод вызова торможения ходовой части автомобиля.
     */
    @Override
    public void brake() {
        int brakeForce = brakeSystem.brake();
        if (currentSpeed <= 100){
            currentSpeed = 0;
        }else {
            currentSpeed = currentSpeed - brakeForce;}
    }

    /**
     * Метод получения текущего объема топлива ходовой части автомобиля.
     *
     * @return текущий объем топлива в ходовой части
     */
    @Override
    public int getCurrentFuelVolume() {
        return fuelSystem.getCurrentFuelVolume();
    }

    /**
     * Метод пополнения топлива ходовой части автомобиля.
     *
     * @param volume объем топлива на который мы хотим заправить ходовую часть
     */
    @Override
    public void fillUpFuel(int volume) {
        fuelSystem.fillUpFuel(volume);
    }

    /**
     * Метод получения текущей скорости ходовой части автомобиля.
     *
     * @return текущая скорость ходовой части
     */
    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
