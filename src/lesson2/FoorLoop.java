package lesson2;

public class FoorLoop {
    public static void main(String[] argv){
        int currentNumber = 0;
        for (currentNumber = 0; currentNumber < 10; currentNumber++) {
            System.out.println(currentNumber);
        }
        //Infinitive loop
        int count = 0;
        int currentNumberInfLoop = 0;
        for (int i = 0; currentNumberInfLoop < 10; count++) {// for(;;)
            System.out.println(currentNumberInfLoop);
        }

        }
}


