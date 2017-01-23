package StrategyDesignPattern;

public class App {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("Dog : "+dog.tryToFly());
        System.out.println("Bird : "+bird.tryToFly());

        dog.setFlyBehavior(new CanFly());
        System.out.println("Dog has been upgraded : "+dog.tryToFly());

    }

}
