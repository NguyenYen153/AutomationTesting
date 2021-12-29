package lesson12.Lab12;

import java.security.SecureRandom;

public abstract class Animal {
    FlyBehavior flyBehavior;
    private final int speed;
    private final String name;
    public  Animal(int maxSpeed, String name){
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        this.name = name;
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getName(){
        return this.name;
    }
    public boolean performFly(){
        return flyBehavior.fly();
    }
}
