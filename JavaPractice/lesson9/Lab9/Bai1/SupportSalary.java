package lesson9.Lab9.Bai1;
//Su dung lay gia tri support Salary of StandardEmployee
//In case using Enum
public enum SupportSalary {
    NONE(0D),
    STANDARD(3D);
    private double supportSalary;
    SupportSalary(double supportSalary){
        this.supportSalary = supportSalary;
    }
    public double value (){
        return this.supportSalary;
    }
}

