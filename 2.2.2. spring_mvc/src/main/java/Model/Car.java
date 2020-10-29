package Model;

public class Car {
    private String model;
    private int year;
    private String number;

    public Car(String model, int year, String number) {
        this.model = model;
        this.year = year;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }
}
