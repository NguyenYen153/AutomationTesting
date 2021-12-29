package lesson12.Lab12;

public class Eagle extends Animal{
    public Eagle(int maxSpeed, String name) {
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
