package lesson12.DesignParternLearning;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    public static void main(String[] args) {
        Duck mallardDuck = new DecoyDuck();
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
