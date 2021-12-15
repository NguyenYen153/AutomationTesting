package lesson7;

import lesson7.Lab7.CEO;
import lesson7.Lab7.StandarEmployee;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static double totalSalary (List<StandarEmployee> standarEmployeeList){
        double standarTotalSalary = 0;
        for(StandarEmployee employee: standarEmployeeList) {
            double monthEmployeeSalary = employee.getSalary() + employee.getSupportSalary();
            standarTotalSalary = standarTotalSalary + monthEmployeeSalary;

        }
        return standarTotalSalary;
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
