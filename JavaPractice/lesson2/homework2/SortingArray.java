package lesson2.homework2;

public class SortingArray {
    public static void main(String[] args) {
        int[] myIntArr = {9, 3, 6, 4, 1, 9, 8, 2, 3};
        int lenOfIntArray = myIntArr.length;
        int min, temp;
        for (int i = 0; i < lenOfIntArray-1; i++) {
            min = i;
            for (int j = i+1; j < lenOfIntArray; j++){
                if (myIntArr[j] < myIntArr[min])
                    min = j;
            }
            temp = myIntArr[i];
            myIntArr[i] = myIntArr[min];
            myIntArr[min] = temp;
        }
        for (int i = 0; i < lenOfIntArray; i++) {
            System.out.println(myIntArr[i]);
        }
    }
}
