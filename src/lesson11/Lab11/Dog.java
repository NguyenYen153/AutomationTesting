package lesson11.Lab11;

import java.security.SecureRandom;

public class Dog extends Animal{
    private final double speed;
    private final String name;
    private final int maxSpeed = 60;


    public Dog(String name) {
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        this.name  = name;
    }


    @Override
    protected double getSpeed() {
        return this.speed;
    }

    @Override
    protected boolean IsFlyAble() {
        return false;
    }

    @Override
    protected String getName() {
        return this.name;
    }

}
