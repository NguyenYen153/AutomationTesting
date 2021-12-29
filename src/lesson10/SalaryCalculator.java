package lesson10;

import java.util.List;

public class SalaryCalculator {
    public static double getTotalSalary(List<Employee> employeeList){
        double totalSalary = 0;

        for (Employee employee : employeeList){
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }
}
