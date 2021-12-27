package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class Example {
        public static void main(String[] args) {
            Map<Integer, String> emergencyList = new HashMap<>();
            emergencyList.put(113,"Police");
            emergencyList.put(114, "Fire Station");
            emergencyList.put(115, "Hospital");
            emergencyList.put(null, "This is 1st null");
            emergencyList.put(null, "This is 2nd null");

            //CRUD
            String oneOneThree = emergencyList.get(113);
            System.out.println(oneOneThree);
            System.out.println(emergencyList.get(null)); //cơ chế ghi đè khi put lần 2 của 1 key

            //Update
            emergencyList.replace(114, "Others"); //Replace tƯơng tự put (ghi đè khi thấy key)
            emergencyList.replace(113,"Police","Officer"); //Chỉ replace khi có đúng cặp key-value đó trong Hash
            System.out.println(emergencyList.get(113));
            System.out.println(emergencyList.get(114));

            //Remove
            emergencyList.remove(113,"Officer"); //chỉ remove khi thấy cặp key-value
            emergencyList.remove(113); //Cứ gặp key thì remove

            //Loop
            System.out.println(emergencyList.keySet());
            Set<Integer> keySet = emergencyList.keySet();
            for(Integer s : keySet){
                System.out.println(emergencyList.get(s));
            }

            //Remove with key has value "Others"
            for(Integer key : emergencyList.keySet()){
                if(emergencyList.get(key).equals("Others")){
                    emergencyList.remove(key);

                }

            }
            System.out.println(emergencyList);

        }

}
