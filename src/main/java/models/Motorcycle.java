package models;

public class Motorcycle extends Vehicle{
    private boolean used;
    public Motorcycle(String name, int year, boolean used) {
        super(name, year);
        this.used = used;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return super.toString() +";"+used;
    }
}
