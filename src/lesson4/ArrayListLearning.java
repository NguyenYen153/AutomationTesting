package lesson4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    //collections List, Map, set
    public static void main(String[] args) {
        //Declaration
       // ArrayList<Integer> myArrList = new ArrayList();
        List<Integer> myArrList = new ArrayList<>();

        //CRUD
        //Add
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(4);
        myArrList.add(2,3);//Insert value 3 into index 2
        //Update
        myArrList.set(myArrList.size()- 1, 10);
        //Remove
        myArrList.remove(myArrList.size()- 1);
        //Read - Get
        for (int elementIndex = 0; elementIndex < myArrList.size(); elementIndex++) {
            System.out.println(myArrList.get(elementIndex));
        }

    }
}
