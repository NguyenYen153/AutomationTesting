package lesson9.Lab9.Bai1;

public class StandardEmployee extends Employee {
    private static final double startSalary = 30000;
    private static  final double startSupportSalary = 5;
    public StandardEmployee(double salary, double supportSalary){
        super(salary, supportSalary);

    }
    public StandardEmployee(){
        super(startSalary, startSupportSalary);

    }
}