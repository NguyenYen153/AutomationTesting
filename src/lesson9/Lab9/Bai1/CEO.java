package lesson9.Lab9.Bai1;

public class CEO extends Employee {
    private static final double startSalary = 100000;
    private static  final double startSupportSalary = 0;

    public CEO(double salary, double supportSalary){
        super(salary, supportSalary);

    }
    public CEO(){
        super(startSalary, startSupportSalary);

    }
}
