package Decorator;

public class CoffeeShopApp {

    public static void main(String[] args) {

        Beverage espressoWithMilk = new Espresso();
        espressoWithMilk = new Milk(espressoWithMilk);
        System.out.println("EspressoWithMilk = " + espressoWithMilk.getCost());

        Beverage americanoWithMilkAndChocolate = new Americano();
        americanoWithMilkAndChocolate = new Milk(americanoWithMilkAndChocolate);
        americanoWithMilkAndChocolate = new Chocolate(americanoWithMilkAndChocolate);
        System.out.println("AmericanoWithMilkAndChocolate = " + americanoWithMilkAndChocolate.getCost());

    }

}
