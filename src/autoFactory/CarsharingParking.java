package autoFactory;

public class CarsharingParking {


    int size;
    private Car[] cars;

    public CarsharingParking(int size) {
        this.size = size;
        cars = new Car[size];
    }

    public void getAvailableCarsNumber(){};

    public void getAvailableFreeSpacesNumber(){};

    public void getCarVinByPlaceNumber(int placeNumber){};

    public Car rentCar(){return null;};

    public void returnCar(Car returnCar){};




}
