/**
 * Класс стальных тормозных дисков.
 */
public class SteelBrakeSystem implements IBrakeSystem {

    /**
     * Это константа, хранящая значение силы торможения.
     */
    private static final int FRICTION_FORCE = 100;

    /**
     * Конструктор стальных тормозных дисков
     */
    public SteelBrakeSystem() {
        System.out.println("Собраны тормоза c силой торможения " + FRICTION_FORCE);
    }

    /**
     * Вызов срабатывания тормозных дисков.
     *
     * @return метод возвращает силу торможения
     */
    @Override
    public int brake() {
        System.out.println("Слышен визг стальных тормозов");
        return FRICTION_FORCE;
    }
}
