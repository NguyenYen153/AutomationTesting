package lesson12.DesignParternLearning;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}
