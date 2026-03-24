
public class ConstructorOverloading {

    int a, b, c;
    double d, e, f;

    ConstructorOverloading(int a, int b) {
        this.a = a;
        this.b = b;
    }

    ConstructorOverloading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    ConstructorOverloading(double d, double e) {
        this.d = d;
        this.e = e;
    }

    ConstructorOverloading(double d, double e, double f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }

    void printIntegers() {
        System.out.println(a + b + c);
    }

    void printDoubles() {
        System.out.println(d + e + f);
    }

    public static void main(String[] args) {

        ConstructorOverloading obj1 = new ConstructorOverloading(1, 2);
        obj1.printIntegers();

        ConstructorOverloading obj2 = new ConstructorOverloading(1, 2, 6);
        obj2.printIntegers();

        ConstructorOverloading obj3 = new ConstructorOverloading(1.5, 2.5);
        obj3.printDoubles();

        ConstructorOverloading obj4 = new ConstructorOverloading(1.5, 2.5, 3.5);
        obj4.printDoubles();
    }
}

