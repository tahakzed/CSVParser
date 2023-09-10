package models;

public class Car extends Vehicle{

    private String transmission;
    public Car(String name, int year, String transmission) {
        super(name, year);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return super.toString() +";"+transmission;
    }
}
