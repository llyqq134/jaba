package graf;

import java.util.Comparator;

public class CarInformation implements Comparator<CarInformation> {
    String number;
    String model;
    String owner;

    String getNumber() {
        return number;
    }

    String getModel() {
        return model;
    }

    String getOwner() {
        return owner;
    }

    CarInformation(String number, String model, String owner) {
        this.number = number;
        this.model = model;
        this.owner = owner;
    }
    void Print() {
        System.out.printf("number: %s\nmodel: %s\nowner: %s\n", number, model, owner);
    }

    public String toString() {
        return "number: " + number + "\nmodel: " + model + "\nowner: " + owner + "\n\n";
    }

    @Override
    public int compare(CarInformation o1, CarInformation o2) {
        return o1.getNumber().compareTo(o2.getNumber());
    }
}
