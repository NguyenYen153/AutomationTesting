package lesson11.Lab11;

import java.security.SecureRandom;

public class Eagle extends Animal{
    private final int speed;
    private final int maxSpeed = 60;
    private final String name;


    public Eagle(String name) {
        this.name = name;
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
    }


    @Override
    protected double getSpeed() {
        return this.speed;
    }

    @Override
    protected boolean IsFlyAble() {
        return true;
    }
    @Override
    protected String getName() {
        return this.name;
    }
}
