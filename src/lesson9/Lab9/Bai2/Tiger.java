package lesson9.Lab9.Bai2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger(int maxSpeed){
        super(maxSpeed);
    }
    public int getTigerSpeed() {
        return getSpeed();
    }
}
