
public class Komplex {

    double a;
    double b;

    double c;
    double d;


    public Komplex(double a, double b) {
        this.a = a;
        this.b = b;

        Komplex a = new Komplex(3.0, 2.0);
        Komplex b = new Komplex(4.0, 1.0);

        Komplex c = a.add(b);
        Komplex d = new Komplex(7, 3);

        Komplex c = a.add(b);
        c = a.multiply(b);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");

        }
    }
}