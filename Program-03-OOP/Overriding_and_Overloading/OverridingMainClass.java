
package Overriding_and_Overloading;

public class OverridingMainClass {

    public static void main(String[] args) {

         Dog dog = new Dog();

           dog.move();
           dog.eat();
           GermanSherperdDog germandog  = new GermanSherperdDog();
           germandog.guard();
           germandog.move();
       System.out.println("==============================");
        Dog dog1[] = new Dog[3];

        dog1[0] = new GermanSherperdDog();
        dog1[1] = new BeagleDog();
        dog1[2] = new Dog();

        for (int i = 0; i < dog1.length; i++) {
            dog1[i].eat();   // Polymorphism happens here
        }
    }
}

