package lesson7.Lab7;

import lesson7.Lab7.CEO;
import lesson7.Lab7.EmployeeType;
import lesson7.Lab7.Manager;
import lesson7.Lab7.StandarEmployee;

import java.text.DecimalFormat;
import static lesson7.Lab7.EmployeeType.*;
public class calculateEmployeesSalaries {

    private static double CEOsalary = 100;
    private static double CEOsupportMoney = 0;
    private static double managerSalary = 50;
    private static double manageSupportMoney = 3;
    private static double standarSalary = 30;
    private static double standarSupportMoney = 5;

    private static double standarHigherSalary = 35;
    private static double standarHigherSupportMoney = 5;

    private static int numberhigherSalaryEmployee = 1;

    public static double totalEmployeeSalary(EmployeeType employeeType, int quantity) {


        double totalSalary = 0;
        double monthEmployeeSalary = 0;

        double totalHigherSalary = 0;
        lesson7.Lab7.CEO ceo = new CEO(CEOsalary,CEOsupportMoney);
        Manager manager = new Manager( managerSalary, manageSupportMoney);
        StandarEmployee standarEmployee = new StandarEmployee(standarSalary , standarSupportMoney);
        StandarEmployee higherSalaryEmployee = new StandarEmployee(standarHigherSalary , standarHigherSupportMoney);

        switch (employeeType) {
            case CEO: {
                monthEmployeeSalary = ceo.getSalary() + ceo.getSupportSalary();
                totalSalary = monthEmployeeSalary * quantity;
                break;
            }
            case MANAGER: {
                monthEmployeeSalary = manager.getSalary() + manager.getSupportSalary();
                totalSalary = monthEmployeeSalary * quantity;
                break;
            }
            case STANDARD: {
                monthEmployeeSalary = standarEmployee.getSalary() + standarEmployee.getSupportSalary();
                totalHigherSalary = (higherSalaryEmployee.getSalary() + higherSalaryEmployee.getSupportSalary()) * numberhigherSalaryEmployee;
                quantity = quantity - numberhigherSalaryEmployee;
                totalSalary = (monthEmployeeSalary * quantity) + totalHigherSalary;
                break;
            }

            default:
                System.out.println("There isn't such as employee");
        }
        return totalSalary;
    }

    public static void main (String[]args){

        double totalSalaryCEO = calculateEmployeesSalaries.totalEmployeeSalary(CEO, 1);
        double totalSalaryStandard = calculateEmployeesSalaries.totalEmployeeSalary(STANDARD, 7);
        double totalSalaryManager= calculateEmployeesSalaries.totalEmployeeSalary(MANAGER, 3);

//            System.out.println(totalSalaryManager);
//            System.out.println(totalSalaryStandard);
//            System.out.println(totalSalaryCEO);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double sumSalary = totalSalaryCEO + totalSalaryManager + totalSalaryStandard;

        System.out.println("Sum salary is " + decimalFormat.format(sumSalary));
    }
}