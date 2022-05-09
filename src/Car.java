public class Car extends Vehicle {

    public Car(String brand, String model, double price, String plate) {
        super(brand, model, price, plate);
        //??
        //??
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car c = (Car) obj;
        return this.getPlate().equals(c.getPlate());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marka: ")
                .append(this.getBrand())
                .append(" Model: ")
                .append(this.getModel())
                .append(" Cena: ")
                .append(this.getPrice())
                .append(" Tablica: ")
                .append(this.getPlate());

        return sb.toString();
    }
}
