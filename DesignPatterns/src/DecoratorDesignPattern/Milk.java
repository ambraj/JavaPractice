package DecoratorDesignPattern;

public class Milk extends AddOnDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 10;
    }

}
