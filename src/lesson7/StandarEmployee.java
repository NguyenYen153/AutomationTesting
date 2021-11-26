package lesson7;

public class StandarEmployee {
    private double salary;
    private double supportSalary;

    public StandarEmployee(double salary, double supportSalary){
        this.salary = salary;
        this.supportSalary = supportSalary;

    }

    public double getSalary() {
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
