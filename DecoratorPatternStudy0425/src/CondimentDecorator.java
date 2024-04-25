public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}

class Mocha extends CondimentDecorator{
    Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 모카 ";
    }
}

class Whip extends CondimentDecorator{

    Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 휘핑크림 ";
    }
}