public class CarInformation {
    private String number;
    private String model;
    private String currentDriver;


    public CarInformation(String number, String model, String currentDriver) {
        this.currentDriver = currentDriver;
        this.model = model;
        this.number = number;
    }
    public String getCurrentDriver() {
        return currentDriver;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void setCurrentDriver(String currentDriver) {
        this.currentDriver = currentDriver;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void Print() {
        System.out.printf("model: %s\nnumber: %s\ncurrent driver: %s\n\n", model, number, currentDriver);
    }
}
