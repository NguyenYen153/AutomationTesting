package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] myIntergerArr = new int[10];
        for (int currentIndex = 0; currentIndex < 10; currentIndex++) {
            myIntergerArr[currentIndex] = currentIndex * 2;
        }
        char[] myCharArr = {'A', 'B', 'C', 'D'};
        //Traditional array
        int lenOfCharArray = myCharArr.length;
        for (int index = 0; index < lenOfCharArray; index++) {
            System.out.println(myCharArr[index]);

        }
       //Enhance array
        for (int elementOfArray : myIntergerArr){
            System.out.println(elementOfArray);

        }
        //For Each
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("A");
        myArrayList.forEach(str -> System.out.println(str));
        //Allow user input an array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of Array: ");
        int lenOfIntArray = scanner.nextInt();

        int [] myIntArr = new int[lenOfIntArray];
        for (int index = 0; index < lenOfIntArray; index++) {
            System.out.print("Index " + index + ": ");
            myIntArr[index] = scanner.nextInt();
        }
        for ( int value : myIntArr){
            System.out.println(value);
        }
    }
}
