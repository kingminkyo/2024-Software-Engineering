public abstract class Duck {
    FlyBehaiver fb;
    Duck(){

    }

    void performFly(){
        fb.fly();
    }

    void setFb(FlyBehaiver fb){
        this.fb = fb;
    }
}

class RedDuck extends Duck{
    RedDuck(){
        this.fb = new FlyWithWings();
    }
}
