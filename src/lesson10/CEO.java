package lesson10;

public class CEO extends Employee{
    @Override
    protected double getSalary() {
        return 100;
    }

    @Override
    protected double getSupportSalary() {
        return 0;
    }
    //Cụ thể hóa implement method

}
