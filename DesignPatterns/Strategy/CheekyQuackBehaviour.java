package Strategy;

public class CheekyQuackBehaviour implements IQuakeBehaviour {

    @Override
    public void quack() {
        System.out.println(this.getClass().getName() + ": Cheeky....Cheeky....Cheeky....Cheeky !!!!!!!");
    }

}
