package StrategyDesignPattern;

public interface FlyBehavior {

    public String tryFlying();

}

class CanFly implements FlyBehavior{

    private FlyBehavior flyBehavior;

    @Override
    public String tryFlying() {
        return  "Flying High";
    }

}

class CanNotFly implements FlyBehavior{

    private FlyBehavior flyBehavior;

    @Override
    public String  tryFlying() {
        return "I can't fly ! :(";
    }

}
