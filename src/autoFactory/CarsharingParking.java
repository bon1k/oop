package autoFactory;

public class CarsharingParking {


    int size;
    private Car[] cars;

    int carOnParking;

    public CarsharingParking(int size) {
        this.size = size;
        cars = new Car[size];
    }


    public void getAvailableCarsNumber(){
        System.out.println("Сейчас на парковке " + carOnParking + " автомобилей");
    }

    public void getAvailableFreeSpacesNumber(){
        int freeSpaseNumder = size - carOnParking;
        System.out.println("На парковке свободных мест " + freeSpaseNumder);

    }
    public void getCarVinByPlaceNumber(int placeNumber){
        int placeInCars = placeNumber-1;
        if (cars[placeInCars] != null && (placeInCars + 1) <= carOnParking){
        cars[placeNumber-1].getVin();}
        else {
            System.out.println("Невозможно получить VIN номер автомобиля по номеру места " + (placeInCars + 1) + " так как автомобиль на данном месте отсутствует");
        }
    }

    public Car rentCar(){
        if (carOnParking > 0){
            carOnParking--;
            return cars[carOnParking];
        }else {
        System.out.println( "В автопарке отсутствуют свободные автомобили. Нельзя взять автомобиль в аренду в текущий момент");
        return null;
        }
    }

    public void returnCar(Car returnCar){
        if (carOnParking < cars.length){
        cars[carOnParking] = returnCar;
        System.out.println("Вы вернули автомобиль " + returnCar.toString());
        carOnParking++;
        }else {System.out.println("В автопарке отсутствуют свободные места. Нельзя разметить в нем данный автомобиль");}

    }


}
