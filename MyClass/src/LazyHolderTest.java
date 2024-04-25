class LazyHolderSingleton{
    private static LazyHolderSingleton uniqueInstance ;
    private LazyHolderSingleton(){

    }
    private static class singleInstanceHolder{
        private static final LazyHolderSingleton UNIZUE_INSTANCE = new LazyHolderSingleton();
    }
    public static LazyHolderSingleton getInstance(){
        return singleInstanceHolder.UNIZUE_INSTANCE;
    }
}
public class LazyHolderTest {
    public static void main(String[] args) {
        LazyHolderSingleton l1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton l2 = LazyHolderSingleton.getInstance();
        System.out.println(l1);
        System.out.println(l2);
    }

    /// thread로부터 safe하고 성능도 챙길 수 있는
    // 응용 시 매개변수 수정으로 추가적인
    // 단 하나의 유니크한 객체만 갖는 것을 보증한다
    // 해당 객체에 대한 접근을 다양한 방법으로 할 수 있게 해줌

}
