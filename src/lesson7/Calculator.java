package lesson7;

public class Calculator {
    //method signature
//    public int sum(int num1, int num2){
//        return num1 + num2;
//    }
//    //Overloading in a class have the same name,different parameters, not important return value
//    public int sum(int num1, int num2, int num3){
//        return num1 + num2 + num3;
//    }
    //Rest parameter | Varagrs
    public  int sum(int... nums){
        System.out.println("Lenght: "+ nums.length);
        int total = 0;
        for (int num : nums){
            total = total + num;
        }
        return total;
    }
    public  int sum(String str, int... nums){
        System.out.println("Lenght: "+ nums.length);
        int total = 0;
        for (int num : nums){
            total = total + num;
        }
        return total;
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.sum(1,6);
        calculator.sum(1, 5, 6);
    }
}
