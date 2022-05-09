public class B extends A {
    int b;
    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    public B(int b) {
        super();
        this.b = b;
    }
    public void b() {
        System.out.println("metoda b z klasy B");
    }
}
