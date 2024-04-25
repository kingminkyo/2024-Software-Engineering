class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private Singleton(){

    }
//    public static synchronized Singleton getInstance(){
//        if(uniqueInstance == null)
//            uniqueInstance = new Singleton();
//        return uniqueInstance;
//    }
public static Singleton getInstance(){
//        if(uniqueInstance == null)
//            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}

public class MyClassTest {
    public static void main(String[] args) {
        // MyClass c1 = new MyClass();
        Singleton m1 = Singleton.getInstance();
        Singleton m2 = Singleton.getInstance();

        System.out.println(m1.toString()); // 다른 메모리 번지수를 가짐
        System.out.println(m2.toString());
        System.out.println(m1.hashCode()); // hashcode는 interger

    }
}
