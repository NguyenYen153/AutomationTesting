package lesson10;

public class Manager extends Employee{

    @Override
    protected double getSalary() {
        return 50;
    }

    @Override
    protected double getSupportSalary() {
        return 3;
    }
}
