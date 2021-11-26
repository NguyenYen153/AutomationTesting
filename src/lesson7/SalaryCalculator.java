package lesson7;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static double totalSalary (List<StandarEmployee> standarEmployeeList){
        double totalSalary = 0;
        double monthEmployeeSalary = totalSalary;
        return totalSalary;
    }

    public static void main(String[] args) {
        List<StandarEmployee> standarEmployeeList = new ArrayList<>();
        StandarEmployee employee_Nam = new StandarEmployee(15.3, 1.0);
        StandarEmployee employee_Ngan = new StandarEmployee(10, 3.5);
        standarEmployeeList.add(employee_Nam);
        standarEmployeeList.add(employee_Ngan);
        double totalSalary = SalaryCalculator.totalSalary(standarEmployeeList);
        System.out.println(totalSalary);
    }
}
