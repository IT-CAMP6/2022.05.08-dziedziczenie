public class Motorcycle extends Vehicle {
    private int capacity;
    private int wheels;

    public Motorcycle(String brand, String model, double price, String plate, int capacity, int wheels) {
        super(brand, model, price, plate);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWheels() {
        return wheels;
    }
}
