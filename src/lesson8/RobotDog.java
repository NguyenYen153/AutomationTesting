

/*
package lesson8;
import java.util.ArrayList;
import java.util.List;

public class RobotDog {
    private  int dogId;
    public  RobotDog(int dogId){
        this.dogId = dogId;
    }
    public int getDogId(){
        return  dogId;
    }
    @Override
    public String toString(){
        return "RobotDog{"+"dogId=" + dogId+ '}';
    }
    public static void main(String[] args) {
        List<RobotDog> robotDogList = new ArrayList<>();
        for (int dogId = 1 ; dogId < 11; dogId++){
            robotDogList.add(new RobotDog(dogId));
        }
        System.out.println(robotDogList);
    }
}*/
//C2: Không dùng contructor
package lesson8;

import java.util.ArrayList;
import java.util.List;

public class RobotDog {
    private  int dogId;
    private static int defaultDogId = 0;// Class variable dung chung cho class, khong dung cho attribute-dùng từ khóa static
    public  RobotDog(){
        dogId = defaultDogId++;
    }
    //Attribute của object
    public int getDogId(){
        return  dogId;
    }
    @Override
    public String toString(){
        return "RobotDog{"+"dogId=" + dogId+ '}';
    }
    //Class method
    public static void changeDefaultDogId(){
        defaultDogId++;
    }
    public static void main(String[] args) {
        List<RobotDog> robotDogList = new ArrayList<>();
        for (int dogId = 1 ; dogId < 11; dogId++){
            robotDogList.add(new RobotDog());
            RobotDog.changeDefaultDogId();
        }
        System.out.println(robotDogList);
    }
    //static trục thuoc class, truoc khi object dc sinh ra

}
