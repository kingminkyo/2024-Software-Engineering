class LazyHolderSingleton{
    private LazyHolderSingleton() {
    }

    private static class singleInstanceHolder{
        private static final LazyHolderSingleton UNIQUE_INSTANCE = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance(){
        return singleInstanceHolder.UNIQUE_INSTANCE;
    }
}

public class LazyHolderTest {
    public static void main(String[] args) {
        //LazyHolderSingleton l1 = new LazyHolderSingleton();
        LazyHolderSingleton l1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton l2 = LazyHolderSingleton.getInstance();
        System.out.println(l1);
        System.out.println(l2);
    }
}
