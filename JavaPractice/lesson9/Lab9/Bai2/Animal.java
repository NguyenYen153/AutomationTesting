package lesson9.Lab9.Bai2;

import java.security.SecureRandom;

public class Animal {
    private final int speed;
    //private int maxSpeed;
    protected Animal(int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
    }

    public int getSpeed() {
        return this.speed;
    }

}
