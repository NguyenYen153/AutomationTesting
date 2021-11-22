package homework4;

import java.util.Scanner;

public class Exercise4 {
        /* String url = "https://google.com";
        Check http OR https; domain name, .com OR .net
         */
    public static void main(String[] args) {
        String userUrlString = "https://google.com";
        String [] urlParts = userUrlString.split("://");
        if(urlParts[0].equals("http")){
            System.out.println("This is http URL");
        }
        else
            System.out.println("This is https URL");
        String [] partOfDomain = urlParts[1].split("\\.");
        System.out.println("The domain is: " + partOfDomain[0]);
        System.out.println("This domain end with: " + partOfDomain[1]);





    }
}
