package DecoratorDesignPattern;

public class Chocolate extends AddOnDecorator {

    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 20;
    }

}
