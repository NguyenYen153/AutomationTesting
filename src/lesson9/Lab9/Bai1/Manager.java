package lesson9.Lab9.Bai1;

public class Manager extends Employee{
    private static final double startSalary = 50000;
    private static  final double startSupportSalary = 3;
    public Manager(double salary, double supportSalary){
        super(salary, supportSalary);

    }
    public Manager(){
        super(startSalary, startSupportSalary);

    }

}

