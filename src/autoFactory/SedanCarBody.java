package autoFactory;

/**
 * Класс кузова седана.
 */
public class SedanCarBody implements ICarBody {

    /**
     * Метод открытия двери.
     */
    @Override
    public void openDoor() {
        System.out.println("Дверь седана открылась");
    }

    /**
     * Метод закрытия двери.
     */
    @Override
    public void closeDoor() {
        System.out.println("Дверь седана закрылась");
    }
}
