package autoFactory;

/**
 * Интерфейс автомобиля.
 */
public interface ICar {

    /**
     * Метод открытия двери автомобиля.
     */
    void openDoor();

    /**
     * Метод закрытия двери автомобиля.
     */
    void closeDoor();

    /**
     * Метод нажатия педали газа.
     */
    void pressGasPedal();

    /**
     * Метод нажатия педали тормоза.
     */
    void pressStopPedal();

    /**
     * Метод пополнения топлива.
     *
     * @param volume объем топлива на который мы хотим заправить автомобиль.
     */
    void fillUpFuel(int volume);

    /**
     * Метод получения VIN номера автомобиля.
     */
    void getVin();

    /**
     * Метод получения регистрационного номера автомобиля.
     */
    void getLicensePlate();

    /**
     * Метод установки регистрационного номера автомобиля.
     *
     * @param licensePlate устанавливаемый регистрационный номер автомобиля
     */
    void setLicensePlate(String licensePlate);

    /**
     * Метод получения текущей скорости автомобиля.
     */
    void getCurrentSpeed();

    /**
     * Метод получения текущего объема топлива в автомобиле.
     */
    void getCurrentFuelVolume();
}
