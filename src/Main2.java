public class Main2 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 100.00, "KR1");
        Car c2 = new Car("Toyota", "Corolla", 100.00, "KR1");

        System.out.println(c1.equals(new Bus()));

        String s1 = "ABC";
        String s2 = new String("ABC");

        System.out.println(s1.equals(s2));

        System.out.println(c1);

        PCBuilder pcBuilder1 = new PCBuilder();
        pcBuilder1.addProcessor("Intel")
                .addDisk("Seagate")
                .addMotherboard("Asus");


        cos(pcBuilder1);

        PC pc = pcBuilder1.build();
    }

    public static void cos(PCBuilder pcBuilder) {
        //wyciaga z bazy karte graficzna
        String karta = "Nvidia";

        pcBuilder.addGraphic(karta);
    }
}
