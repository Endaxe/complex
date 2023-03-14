
public class Main {

    double a;
    double b;
    public Main(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public static void main(String[] args) {
        Main a = new Main(3.0, 2.0);
        Main b = new Main(4.0, 1.0);

        System.out.println("talet borde vara 3 + 2i:\n" + a);

        Main c = a.add(b);
        Main d = new Main(7, 3);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }

        c = a.multiply(b);
        d = new Main(10, 11);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till 3+2i är " + a.arg());
        if (a.arg() == Math.atan(2.0 / 3)) {
            System.out.println("arg() funkar!!");
        }
    }

    private double arg() {
        return 1;
    }

    private Main multiply(Main b) {
        return b;
    }

    private Main add(Main b) {

        return b;
    }
}