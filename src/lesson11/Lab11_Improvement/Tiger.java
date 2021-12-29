package lesson11.Lab11_Improvement;

public class Tiger extends Animal{


    public Tiger(int maxSpeed, String name) {
        super(maxSpeed, name);
    }

    @Override
    protected boolean IsFlyAble() {
        return false;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
