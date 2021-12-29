package lesson2;

public class Break {
    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5};
        //Find index number = 4 in array
        int targetIndex = -1;
        for (int index = 0; index < myArr.length; index++) {
            System.out.println(myArr[index]);
            if (myArr[index] == 4) {
                targetIndex = index;
                break;// Exit for loop
            }
        }
        if (targetIndex < 0)
            System.out.println("Number 4 isn't found in array");
        else
            System.out.println("Number 4 is found at index is: " + targetIndex);

    }
}
