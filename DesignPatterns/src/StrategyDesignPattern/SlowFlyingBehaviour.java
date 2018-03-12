package StrategyDesignPattern;

public class SlowFlyingBehaviour implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + ": I don't want to fly!!!!!!!!!");
    }

}
