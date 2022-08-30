import autoFactory.Car;
import autoFactory.CarFactory;
import mikleBank.BankAccount;
import mikleBank.IBankAccount;

public class Main {
    public static void main(String[] args) {

        IBankAccount bankAccount = new BankAccount(300000);
        bankAccount.getBalance();
        bankAccount.deposit(10000);
        bankAccount.getBalance();
        bankAccount.withdraw(50000);
        bankAccount.getBalance();

        CarFactory carFactory = new CarFactory();
        Car car = carFactory.buildCar("12312-32443",17,100,2,
                "SEDAN",true,2 );

        car.getCurrentFuelVolume();
        car.fillUpFuel(19);
        car.getCurrentFuelVolume();
        car.pressGasPedal();
        car.getCurrentSpeed();
        car.pressStopPedal();
        car.getCurrentSpeed();








    }
}