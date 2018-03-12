package StrategyDesignPattern;

public class Duck {

    private IFlyBehaviour flyBehaviour;
    private IQuakeBehaviour quakeBehaviour;

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
