package homework2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageValueOfArray {
    public static void main(String[] args) {
        int lenOfIntArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of Array: ");
        lenOfIntArray = scanner.nextInt();

        double [] myIntArr = new double[lenOfIntArray];
        for (int index = 0; index < lenOfIntArray; index++) {
            System.out.print("Index " + index + ": ");
            myIntArr[index] = scanner.nextDouble();
        }
        double sumArray = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /* Lam tron xuong
        // ecimalFormat.setRoundingMode(RoundingMode.DOWN);
        //System.out.println("Rounding DOWN : " + decimalFormat.format(averageValue)); // 2007.39
        */
        for (int index = 0; index < lenOfIntArray; index++) {
            sumArray = sumArray + myIntArr[index];
        }
        System.out.println("Default decimalFormat : " + decimalFormat.format(sumArray/lenOfIntArray));
    }
}
