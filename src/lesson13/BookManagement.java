package lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();//In-memory Storage
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("Author Name: ");
        String authorName = scanner.nextLine();
        System.out.println("YEAR: ");
        int year = Integer.parseInt(scanner.nextLine());
        //Save
        Book newBook = new Book(ISBN, title, authorName, year);
        bookList.add(newBook);

        //Save into file System
        String bookFilePath = System.getProperty("user.dir").concat("book.txt");
        DataFactory.saveBookList(bookList, bookFilePath);

        //Retrieve | ISBN -In memory storage
        System.out.println("Book ISBN find: ");
        String toFindISBN = scanner.nextLine();
        Book foundBook = null;

        for (Book bookItem : bookList) {
            if (bookItem.getISBN().equals(toFindISBN)) {
                foundBook = bookItem;
                break;
            }
        }
        if (foundBook == null) {
            System.out.println("There is no book with ISBN: " + ISBN);
        } else {
            System.out.println(foundBook);
        }

        //Retrive |
    }

    public static List<Book> readBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null){
                String []bookData = dataLine.split(";");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
