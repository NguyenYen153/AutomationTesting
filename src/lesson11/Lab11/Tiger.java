package lesson11.Lab11;

import java.security.SecureRandom;

public class Tiger extends Animal{

    private final int speed;
    private final int maxSpeed = 100;
    private final String name;


    public Tiger(String name) {
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        this.name = name;
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
