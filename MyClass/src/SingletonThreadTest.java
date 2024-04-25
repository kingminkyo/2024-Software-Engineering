public class SingletonThreadTest {

    public static void main(String[] args) {
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s3 = Singleton.getInstance();
                System.out.println(s3.hashCode());
            }
        });

        Thread t4 = new Thread(() -> {
            Singleton s4 = Singleton.getInstance();
            System.out.println(s4.hashCode());

        });


        t3.start();
        t4.start();
        System.out.println("hello");
    }
}
