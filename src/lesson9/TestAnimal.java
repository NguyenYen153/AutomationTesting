package lesson9;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Miumiu");
        cat.speak();
        cat.printDefaultName();
        Dog dog = new Dog("Mực");
        //Animal Dog = new Dog("Mực");// Xay ra loi neu goi ham rieng cua con
        dog.swim();
        dog.printDefaultName();
        cat.printDefaultName();
        }
}
