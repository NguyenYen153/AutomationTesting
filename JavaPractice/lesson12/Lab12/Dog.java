package lesson12.Lab12;

public class Dog extends Animal{
    public Dog(int maxSpeed, String name) {
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

