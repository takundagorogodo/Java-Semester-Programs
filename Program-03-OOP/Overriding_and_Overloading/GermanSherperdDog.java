package Overriding_and_Overloading;

public class GermanSherperdDog extends Dog {

    @Override
    void move() {
        super.move();
        System.out.println("German Shepherd can move very fast and is used for guarding");
    }

    @Override
    void eat() {
        System.out.println("German Shepherd eats meat and milk");
    }

    void guard() {
        System.out.println("German Shepherd is very good for security");
    }
}
