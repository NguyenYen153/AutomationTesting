package lesson10;

public class StandarEmployee extends Employee{

    @Override
    protected double getSalary() {
        return 30;
    }

    @Override
    protected double getSupportSalary() {
        return 5;
    }
}
