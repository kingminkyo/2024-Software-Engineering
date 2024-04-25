public class DuckGameMain {
    public static void main(String[] args) {
        Duck duck1 = new RedDuck();
        duck1.performFly();
        duck1.setFb(new FlyWithRockets());
        duck1.performFly();
    }
}
