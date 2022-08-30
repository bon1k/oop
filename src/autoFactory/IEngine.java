package autoFactory;

/**
 * Интерфейс двигателя.
 */
public interface IEngine {

    /**
     * Метод ускорения двигателя.
     *
     * @return силу ускорения двигателя
     */
    int accelerate();

    /**
     * Метод получения мощности двигателя.
     *
     * @return количество лошадиных сил двигателя
     */
    int getHorsepower();

    /**
     * Метод получения объема двигателя.
     *
     * @return объем двигателя
     */
    int getVolume();
}
