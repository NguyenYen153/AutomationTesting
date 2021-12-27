package lesson9.Lab9.Bai2;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog(int maxSpeed){
        super(maxSpeed);
    }
    public int getDogSpeed() {
        return getSpeed();
    }

}
