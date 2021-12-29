package lesson10;
// Class truu tuong
//Implements in lesson 12
public abstract class Employee{
    //Method truu tuong
    protected abstract double getSalary();
    protected abstract double getSupportSalary();
    //WHen implements   Comparable<Employee>
//    public int compare(Employee empTOCompare){
//        Double diffSaraly = getSalary() - empTOCompare.getSupportSalary();
//        return diffSaraly.intValue();
//    }
}
