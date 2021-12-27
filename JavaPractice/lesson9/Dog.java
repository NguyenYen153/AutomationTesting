package lesson9;

public class Dog extends Animal {
    static {
        defaultName = "Cho";
    }
    public Dog(String name){
        super(name);
    }
    public void speak(){
        System.out.println("Meo meo, my name is " + getName());//neu cha de protected thi con co the access truc tiep
    }
    public void swim(){
        System.out.println("I'm swimming");
    }
}
