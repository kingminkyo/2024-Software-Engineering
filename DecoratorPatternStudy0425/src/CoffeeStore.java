public class CoffeeStore {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + "가격은 " + beverage1.cost() );

    }
}
