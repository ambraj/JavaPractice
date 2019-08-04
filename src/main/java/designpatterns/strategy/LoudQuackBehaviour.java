package designpatterns.strategy;

public class LoudQuackBehaviour implements IQuakeBehaviour {

    @Override
    public void quack() {
        System.out.println(this.getClass().getName() + ": QUACCCKKKKKKKKKKKKKKKKKKK !!!!!!!");
    }

}
