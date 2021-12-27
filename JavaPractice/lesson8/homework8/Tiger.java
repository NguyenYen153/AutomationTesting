package lesson8.homework8;

import java.security.SecureRandom;

public class Tiger {
    private final int speed;
    public Tiger(){
        this.speed = new SecureRandom().nextInt(100 + 1);
    }

    public int getSpeed() {
        return this.speed;
    }
}
