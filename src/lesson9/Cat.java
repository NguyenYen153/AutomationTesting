package lesson9;
//Inheritance :
public class Cat extends Animal {
    //Class
    static {
        defaultName = "Meo";
    }
    public Cat(String name){
        super(name);
    }
    public void speak(){
        System.out.println("Meo meo, my name is " + getName());//neu cha de protected thi con co the access truc tiep
    }
    //Khong overide tu Animal
    public  static void doSth(){

    }

}
