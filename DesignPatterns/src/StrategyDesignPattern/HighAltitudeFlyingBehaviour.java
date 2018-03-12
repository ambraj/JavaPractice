package StrategyDesignPattern;

public class HighAltitudeFlyingBehaviour implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + ": Flying High!!!!!!!!!");
    }

}
