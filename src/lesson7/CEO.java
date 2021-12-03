package lesson7;

public class CEO {
    private double salary;
    private double supportSalary;

    public CEO(double salary, double supportSalary){
        this.salary = salary;
        this.supportSalary = supportSalary;

    }

    public  double getSalary() {
        //System.out.println("CEO " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}
