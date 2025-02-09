package academy.javapro;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void accelerate();

    public abstract void brake();

    // TODO: Add getters/setters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
}
