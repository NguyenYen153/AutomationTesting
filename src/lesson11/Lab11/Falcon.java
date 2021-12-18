package lesson11.Lab11;

import java.security.SecureRandom;

public class Falcon extends Animal{

    private final int speed;
    private final int maxSpeed = 40;
    private final String name;


    public Falcon(String name) {
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        this.name = name;
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
