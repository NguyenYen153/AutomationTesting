package lesson12.Lab12;

public class Falcon extends Animal{
    public Falcon(int maxSpeed, String name) {
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
