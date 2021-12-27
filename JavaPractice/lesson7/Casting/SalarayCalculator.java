package lesson7.Casting;

import lesson7.Lab7.CEO;
import lesson7.Lab7.Manager;
import lesson7.Lab7.StandarEmployee;
import lesson7.SalaryCalculator;

public class SalarayCalculator {
    //Employee, quantity
    public static double getEmployeeTotalSalary(Object employeeObj, int quantity) {
        double totalSalary = 0;
        if (employeeObj.getClass().equals(CEO.class)) {
            CEO ceo = (CEO) employeeObj;
            totalSalary = (ceo.getSupportSalary() + ceo.getSalary())* quantity;
        } else if (employeeObj.getClass().equals(Manager.class)) {
            Manager manager = (Manager) employeeObj;
            totalSalary = (manager.getSalary() + manager.getSupportSalary() )* quantity;
        }
        else if (employeeObj.getClass().equals(StandarEmployee.class)){
            StandarEmployee standarEmployee = (StandarEmployee) employeeObj;
            totalSalary = (standarEmployee.getSalary() + standarEmployee.getSupportSalary())*quantity;
        }
        else
            throw new IllegalArgumentException("Class isn't support");
        return totalSalary;
    }

    public static void main(String[] args) {
        CEO ceo = new CEO(100, 1);
        Manager manager = new Manager(50, 3);
        StandarEmployee standarEmployee = new StandarEmployee(30, 5);
        double ceoSalary = getEmployeeTotalSalary(ceo, 1);
        double managerSalary = getEmployeeTotalSalary(manager, 4);
        double standardSalary = getEmployeeTotalSalary(standarEmployee, 10);
        System.out.printf("Sumary salary is: %g", ceoSalary + managerSalary + standardSalary);
    }
}
