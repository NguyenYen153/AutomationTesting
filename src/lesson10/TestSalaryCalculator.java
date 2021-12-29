package lesson10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalaryCalculator {
    public static void main(String[] args) {
        Employee ceo = new CEO();
        Employee manager = new Manager();
        Employee standardEmployee = new StandarEmployee();
        List<Employee> employeeList = Arrays.asList(ceo, manager, standardEmployee);
        double totalSalary = SalaryCalculator.getTotalSalary(employeeList);
        //Sortting
       // Collections.sort(employeeList);
    }
}
