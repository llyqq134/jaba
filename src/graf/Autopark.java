package graf;

import graf.CarInformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Autopark {
    ArrayList<CarInformation> cars;

    Autopark() {
        cars = new ArrayList<>();
    }

    void Add(CarInformation car) {
        cars.add(car);
    }

    CarInformation Pop() {
        return cars.remove(cars.size() - 1);
    }

    void RemoveByNumber(String number) {
        for (var i : cars)
            if (i.getNumber().equals(number)) {
                cars.remove(i);
                break;
            }
    }

    CarInformation findByNumber(String number) {
        for(var i : cars)
            if (i.getNumber().equals(number))
                return i;

        return null;
    }

    void Print() {
        for (var i : cars)
            i.Print();
    }

    public void sortByField(String field) {
        Collections.sort(cars, new Comparator() {
            public int compare(Object o1, Object o2) {
                if (field.equalsIgnoreCase("number")) {
                    return ((CarInformation)o1).getNumber().compareTo(((CarInformation)o2).getNumber());
                }
                else if (field.equalsIgnoreCase("model")) {
                    return((CarInformation)o1).getModel().compareTo(((CarInformation)o2).getModel());
                }

                return ((CarInformation)o1).getOwner().compareTo(((CarInformation)o2).getOwner());
            }
        });
    }
}
