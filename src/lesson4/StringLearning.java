package lesson4;

public class StringLearning {
    public static void main(String[] args) {
        //Literal decleration
        String s1 = "Cat";//String pool
        String s2 = "Cat";//String pool
        System.out.println(s1 == s2);

        String s3 = new String("Cat");//Java Heap
        System.out.println(s1.equals(s3));//s1 == s3 -> false

        //lower cases, upper cases, number
        String myPassword = "123Password";
        char [] myCharaters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCases = 0;
        int totalUpperCases = 0;
        for( char character: myCharaters){
            if (Character.isDigit(character))
                totalDigits++;
            if (Character.isLowerCase(character))
                totalUpperCases++;
            if (Character.isUpperCase(character))
                totalUpperCases++;
        }
        if (totalDigits > 0 && totalLowerCases > 0 && totalUpperCases > 0) {
            System.out.println("You are all set");
        }
        else
            {
                System.out.println("Password isn't matched the pattern");

            }
        //Replacement
        String badWordsContainers = " bad, very bad, something else... ";
        String filterOftString = badWordsContainers.trim().replace("bad", "***");
        System.out.println(filterOftString);

        //Sub-str, index, split
        String myUrl = "https://sdetpro.com";
        String [] myUrlSplitResult = myUrl.split("");
        for (String s: myUrlSplitResult){
            System.out.println(s);
        }
        String[] myUrlParts = myUrl.split("\\.");
        for (String s: myUrlParts){
            System.out.println(s);
        }
        System.out.println(myUrl.indexOf("t"));
        System.out.println(myUrl.substring(myUrl.indexOf("sdetpro"), myUrl.indexOf(".")));//Exclusive
        //Concatemation, String Builder
        String helloString = "Hello";
        String worldString = "World";
        System.out.println(helloString + worldString);
        System.out.println(helloString.concat(worldString));// Can concat many times
        int [] myIntArr = {1,2,3,4,5,6,7,8,9};
        for (int elementIndex = 0; elementIndex < myIntArr.length; elementIndex++) {
            System.out.println("My element number " + (elementIndex + 1) + " is " + myIntArr[elementIndex]);
        }
        //Regex - regular Expression
        String totalPriceStr = "1098 vnd";
        String totalPriceNumStr = totalPriceStr.replaceAll("[^0-9]","");
        System.out.println(totalPriceNumStr);
        int totalPriceNum = Integer.parseInt(totalPriceStr);


    }
    }

