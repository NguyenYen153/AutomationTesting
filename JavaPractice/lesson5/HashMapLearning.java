package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Police");
        emergencyList.put(114, "Police");
        emergencyList.put(116, "Others");
        emergencyList.put(115, "Hospital");

        //CRUD
        emergencyList.put(null, "Hospital");//Duplicate key will replace,  key may be = null
        emergencyList.put(null, null);

        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(117));// Neu k có key -> tra default : null
        // Update
        emergencyList.replace(null, "NULL");
        emergencyList.replace(null, "New one", "Replaced");
        //Remove
        emergencyList.remove(113, "policce");
        emergencyList.remove(null);
        System.out.println(emergencyList.get(null));

        //Return key of Map
//        Set<Integer> keySet = emergencyList.keySet();
//        for (Integer key : keySet) {
//            System.out.println(emergencyList.get(key));
//        }
        //Remove with key has Others value
//
        //
    }
}