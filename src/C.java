public class C extends B {
    int c;

    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public C(int b, int c) {
        super(b);
        this.c = c;
    }
    public void c() {
        System.out.println("metoda c z klasy C");
    }
}
