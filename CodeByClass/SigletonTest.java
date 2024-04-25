class Singleton {
    //private static Singleton uniqueInstance = new Singleton();
    private static Singleton uniqueInstance;

    private Singleton() {
    }
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
//public static Singleton getInstance(){
        return uniqueInstance;
    }
}

public class SigletonTest {
    public static void main(String[] args) {
        //Singleton s0 = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
