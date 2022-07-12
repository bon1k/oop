/**
 * Класс кузова хэтчбека.
 */
public class HatchbackCarBody implements ICarBody {

    /**
     * Метод открытия двери.
     */
    @Override
    public void openDoor() {
        System.out.println("Дверь хэтчбека открылась");
    }

    /**
     * Метод закрытия двери.
     */
    @Override
    public void closeDoor() {
        System.out.println("Дверь хэтчбека закрылась");
    }
}
