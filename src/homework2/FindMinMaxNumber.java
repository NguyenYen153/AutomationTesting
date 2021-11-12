package homework2;
/*
Exercise 01
Given an array from user input
Return the index of the max/min number from the array
Note: We ignore the case we have more than one maximum/minimum number

 */
import java.util.Scanner;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        int lenOfIntArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of Array: ");
        lenOfIntArray = scanner.nextInt();

        int [] myIntArr = new int[lenOfIntArray];
        for (int index = 0; index < lenOfIntArray; index++) {
            System.out.print("Index " + index + ": ");
            myIntArr[index] = scanner.nextInt();
        }
        int maxNumber = myIntArr[0];
        int minNumber = myIntArr[0];
        for (int indexArr = 0; indexArr < lenOfIntArray - 1; indexArr++) {
            if (myIntArr[indexArr + 1] > maxNumber){
                maxNumber = myIntArr[indexArr + 1];
            }
            if (myIntArr[indexArr + 1] < minNumber){
                minNumber = myIntArr[indexArr + 1];
            }
        }
        System.out.println("Max number is: " + maxNumber);
        System.out.println(("Min number is: " + minNumber));






    }
}
