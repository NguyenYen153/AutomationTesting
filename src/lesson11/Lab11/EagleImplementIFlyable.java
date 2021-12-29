package lesson11.Lab11;

import java.security.SecureRandom;

public class EagleImplementIFlyable extends Animal implements IFlyable{

    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    protected double getSpeed() {
        return 0;
    }

    @Override
    protected boolean IsFlyAble() {
        return false;
    }

    @Override
    protected String getName() {
        return null;
    }
}
