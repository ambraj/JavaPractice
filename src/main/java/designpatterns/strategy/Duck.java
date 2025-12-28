package designpatterns.strategy;

public class Duck {

    private final IFlyBehaviour flyBehaviour;
    private final IQuakeBehaviour quakeBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuakeBehaviour quakeBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quakeBehaviour = quakeBehaviour;
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void quack() {
        quakeBehaviour.quack();
    }

}
