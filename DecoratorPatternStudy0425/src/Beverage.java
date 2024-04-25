public abstract class Beverage {
    String description = "제목 없음";
    public String getDescription(){
        return description;
    }
    abstract double cost();
}

class HouseBlend extends Beverage{

    HouseBlend(){
        description = "하우스 블렌드 커피";
    }
    @Override
    double cost() {
        return .89;
    }
}

class Espresso extends Beverage{

    Espresso(){
        description = "에스프레소";
    }
    @Override
    double cost() {
        return 1.99;
    }
}



