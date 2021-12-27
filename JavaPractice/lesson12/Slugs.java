package lesson12;

public interface Slugs {
    String lesson_1 = "/lesson1";
    String lesson_2 = "/lesson2";
    // From java 8 have defauult and static
    default void doSmt(){
        System.out.println("Do something");
    }
    static void doAnotherThing(){
        System.out.println("Do another thing");
    }
}
