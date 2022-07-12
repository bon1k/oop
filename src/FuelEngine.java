/**
 * Класс бензинового двигателя.
 */
class FuelEngine implements IEngine {

    /**
     * Количество лошадиных сил двигателя.
     */
    private final int horsepower;
    /**
     * Объем двигателя.
     */
    private final int volume;

    /**
     * Конструктор бензинового двигателя.
     *
     * @param volume     объем создаваемого двигателя
     * @param horsepower количество лошадиных сил создаваемого двигателя
     */
    public FuelEngine(int horsepower, int volume) {
        this.horsepower = horsepower;
        this.volume = volume;

        System.out.println("Собран бензиновый двигатель силой " + horsepower + " Л.С. и объемом " + volume + " л.");
    }

    /**
     * Метод ускорения бензинового двигателя.
     *
     * @return силу ускорения двигателя
     */
    @Override
    public int accelerate() {
        System.out.println("Р-р-р - звук мотора мощностью " + horsepower + " Л.С.");
        return horsepower;
    }

    /**
     * Метод получения мощности двигателя.
     *
     * @return количество лошадиных сил двигателя
     */
    @Override
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * Метод получения объема двигателя.
     *
     * @return объем двигателя
     */
    @Override
    public int getVolume() {
        return volume;
    }
}
