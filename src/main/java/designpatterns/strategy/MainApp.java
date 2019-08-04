package designpatterns.strategy;

public class MainApp {

    public static void main(String[] args) {

        Duck mountainDuck = new Duck(new HighAltitudeFlyingBehaviour(), new LoudQuackBehaviour());
        Duck littleDuck = new Duck(new SlowFlyingBehaviour(), new CheekyQuackBehaviour());

        System.out.println("Here comes Mighty Mountain Duckkkk!!!!");
        mountainDuck.fly();
        mountainDuck.quack();

        System.out.println("\nGo away, you little Duck!!!!");
        littleDuck.fly();
        littleDuck.quack();

    }

}
