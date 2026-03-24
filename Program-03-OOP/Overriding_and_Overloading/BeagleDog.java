package Overriding_and_Overloading;

public class BeagleDog extends Dog {

    @Override
    void move() {
        super.move();
        System.out.println("Beagle runs faster than an ordinary dog");
    }

    @Override
    void eat() {
        System.out.println("Beagle eats biscuits and mixed food");
    }
}
