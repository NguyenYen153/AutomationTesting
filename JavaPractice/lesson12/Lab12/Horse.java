package lesson12.Lab12;

public class Horse extends Animal{
    public Horse(int maxSpeed, String name) {
        super(maxSpeed, name);
        flyBehavior = new NotFlyable();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
