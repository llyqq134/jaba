import java.util.*;

public class Autopark {
    private ArrayList<CarInformation> listOfCars;

    public Autopark() {
        listOfCars = new ArrayList<CarInformation>();
    }

    public Autopark(ArrayList<CarInformation> listOfCars) {
        this.listOfCars = listOfCars;
    }

    public void AddCar(String number, String model, String currentDriver) {
        CarInformation car = new CarInformation(number, model, currentDriver);
        listOfCars.add(car);
    }

    public CarInformation FindByNumber(String number) {
        for (var i : listOfCars)
            if (i.getNumber().equals(number))
                return i;
        return null;
    }

    public CarInformation DeleteByNumber(String number) {
        CarInformation car = null;

        for (int i = 0; i < listOfCars.size(); ++i) {
            if (listOfCars.get(i).getNumber().equals(number)) {
                car = listOfCars.get(i);
                listOfCars.remove(listOfCars.get(i));
            }
        }

        return car;
    }

    public void SortByNumber() {
        for (int i = 0; i < listOfCars.size(); ++i) {
            for (int j = 0; j < listOfCars.size(); ++j) {
                if (listOfCars.get(i).getNumber().compareTo(listOfCars.get(j).getNumber()) < 0) {
                        var temp = listOfCars.get(i);
                        listOfCars.set(i, listOfCars.get(j));
                        listOfCars.set(j, temp);
                }
            }
        }
    }

    public void SortByCurrentDriver() {
        for (int i = 0; i < listOfCars.size(); ++i) {
            for (int j = 0; j < listOfCars.size(); ++j) {
                if (listOfCars.get(i).getCurrentDriver().compareTo(listOfCars.get(j).getCurrentDriver()) < 0) {
                    var temp = listOfCars.get(i);
                    listOfCars.set(i, listOfCars.get(j));
                    listOfCars.set(j, temp);
                }
            }
        }
    }

    public void SortByModel() {
        for (int i = 0; i < listOfCars.size(); ++i) {
            for (int j = 0; j < listOfCars.size(); ++j) {
                if (listOfCars.get(i).getModel().compareTo(listOfCars.get(j).getModel()) < 0) {
                    var temp = listOfCars.get(i);
                    listOfCars.set(i, listOfCars.get(j));
                    listOfCars.set(j, temp);
                }
            }
        }
    }

    public void Print() {
        for (var i : listOfCars)
            i.Print();
    }
}
