public class Bus extends Vehicle {
    private int seats;

    public Bus(String brand, String model, double price, String plate, int seats) {
        super(brand, model, price, plate);
        this.seats = seats;
    }

    public Bus(int seats) {
        this.seats = seats;
    }

    public Bus() {

    }

    public int getSeats() {
        return seats;
    }
}
