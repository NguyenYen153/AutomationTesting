package lesson3;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count++;
            if (count == 7)
                break;
        }
        /*
        for(;count < 10;) {
         System.out.println(count);
            count++;
        }

        */
        System.out.println(count);
        System.out.println("Out of while loop!");
    }
}
