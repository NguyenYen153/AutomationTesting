package lesson9.Lab9.Bai1;


import java.util.ArrayList;
import java.util.List;

public class calculateEmployeesSalaries {
    public static double getTotalSalary(List<Employee> employeeList){
        double totalSalary = 0;

        for (Employee employee : employeeList){
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        CEO ceo = new CEO(100, 0);
        Manager manager = new Manager(50, 3);
        StandardEmployee standardEmployee = new StandardEmployee(30, 5);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(ceo);
        employeeList.add(manager);
        employeeList.add(standardEmployee);
        double totalSalary = calculateEmployeesSalaries.getTotalSalary(employeeList);
        System.out.println("Summary salaries is: " + totalSalary);

    }
}
