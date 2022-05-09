public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla", 100.00, "KR1");

        c.setRent(true);
        c.setPlate("ASDFGSDf");

        System.out.println(c.getPlate());

        Motorcycle motorcycle = new Motorcycle("Toyota", "Corolla", 100.00, "KR1", 123, 123);

        motorcycle.setPlate("sdfgsdfg");

        motorcycle.getWheels();

        /*C c1 = new C();
        c1.metoda();*/

        /*C c1 = new C();
        c1.a();
        c1.b();
        c1.c();*/

        Dog dog = new Dog();
        dog.walk();

        Cat cat = new Cat();
        cat.walk();

        Snake snake = new Snake();
        snake.walk();

        /*Motorcycle motorcycle1 = new Motorcycle("Toyota", "Corolla", 100.00, "KR1", 123, 123);
        Vehicle v = new Motorcycle("Toyota", "Corolla", 100.00, "KR1", 123, 123);
        Vehicle v2 = motorcycle1;

        Vehicle v3 = new Car("Toyota", "Corolla", 100.00, "KR1");

        Motorcycle m2 = (Motorcycle) v;*/

        Vehicle[] tab = new Vehicle[3];
        tab[0] = new Car("Toyota", "Corolla", 100.00, "KR1");
        tab[1] = new Bus();
        tab[2] = new Motorcycle("Toyota", "Corolla", 100.00, "KR1", 123, 123);

        if(tab[1] instanceof Car) {
            Car car = (Car) tab[1];
        }

        if(tab[0] instanceof Car) {
            //Potraktuj jak samochód
        } else if(tab[0] instanceof Bus) {
            //Potraktuj jak bus
        } else if(tab[0] instanceof Motorcycle) {
            //Potraktuj jak motor
        }
    }
}
