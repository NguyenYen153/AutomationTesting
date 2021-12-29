package lesson9;

public class Animal {
    protected  String name;
    //Class avarible can overide

    protected static String defaultName = "Animal";
    public Animal(String name){
        this.name = name;
    }
    protected void speak(){
        System.out.println(" Hello ");
    }
    public String getName(){
        return this.name;
    }
    public void printDefaultName(){
        System.out.println("My name is " + defaultName);
    }
    //Class method can not overide
    public  static void doSth(){

    }
}
