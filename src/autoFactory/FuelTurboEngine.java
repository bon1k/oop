package autoFactory;

/**
 * Класс бензинового турбо-двигателя.
 */
class FuelTurboEngine extends FuelEngine {

    /**
     * Количество турбин.
     */
    private final int turbineCount;

    /**
     * Конструктор бензинового турбо-двигателя.
     *
     * @param volume       объем создаваемого двигателя
     * @param horsepower   количество лошадиных сил создаваемого двигателя
     * @param turbineCount количество турбин создаваемого двигателя
     */
    public FuelTurboEngine(int horsepower, int volume, int turbineCount) {
        super(horsepower, volume);
        this.turbineCount = turbineCount;
        System.out.println("Собранный двигатель дополнительно усилен " + turbineCount + " турбинами");
    }

    /**
     * Метод ускорения бензинового турбо-двигателя.
     *
     * @return возвращает силу ускорения двигателя
     */
    @Override
    public int accelerate() {
        System.out.println(
                "A-р-р-р-р-р - звук мотора мощностью " + getHorsepower() + " Л.С. и " + turbineCount + " турбин");
        int horsepower = getHorsepower();
        return horsepower * turbineCount;
    }
}
