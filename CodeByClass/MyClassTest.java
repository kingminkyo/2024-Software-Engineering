class MyClass {
    private MyClass() {
    }
    public static MyClass getInstance(){
        return new MyClass();
    }
}


public class MyClassTest {
    public static void main(String[] args) {
        //MyClass m1 = new MyClass();
        MyClass m1 = MyClass.getInstance();
        MyClass m2 = MyClass.getInstance();
        //System.out.println(m1);
        System.out.println(m1.toString());
        System.out.println(m2.toString());


    }
}
