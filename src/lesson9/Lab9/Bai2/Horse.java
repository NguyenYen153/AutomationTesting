package lesson9.Lab9.Bai2;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse(int maxSpeed){
        super(maxSpeed);
    }
    public int getHorseSpeed() {
        return getSpeed();
    }

}
