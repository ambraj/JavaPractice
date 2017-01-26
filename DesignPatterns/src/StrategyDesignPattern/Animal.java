package StrategyDesignPattern;

public class Animal {

    FlyBehavior flyBehavior;

    public void speak() {
        System.out.println("Can speak!");
    }

    public String tryToFly() {
        return flyBehavior.tryFlying();
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }
}

class Dog extends Animal {

    public Dog() {
        super();

        flyBehavior = new CanNotFly();
    }

}

class Bird extends Animal {

    public Bird() {
        super();

        flyBehavior = new CanFly();
    }

}