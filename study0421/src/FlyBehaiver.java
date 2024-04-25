public interface FlyBehaiver {
    void fly();
}


class FlyWithWings implements FlyBehaiver{
    public void fly(){
        System.out.println("날개 비행");
    }
}

class CantFly implements FlyBehaiver{
    public void fly(){
        System.out.println("비행 불가");
    }
}

class FlyWithRockets implements FlyBehaiver{
    public void fly(){
        System.out.println("로켓 비행");
    }
}
