package lesson11.Lab11_Improvement;

import java.security.SecureRandom;

public abstract class Animal {
    private final int speed;
    private final String name;
    public  Animal(int maxSpeed, String name){
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        this.name = name;
    }
    public int getSpeed(){
      return this.speed;
    }
    protected abstract boolean IsFlyAble();
    public String getName(){
        return this.name;
    }
}
