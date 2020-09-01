package module02.lesson07.task1;

public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
