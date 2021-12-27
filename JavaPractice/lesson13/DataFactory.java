package lesson13;

import java.io.*;
import java.util.List;

public class DataFactory {
    public static void saveBookList(List<Book> bookList, String path){
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        )
        {
            for(Book book: bookList){
                //1234;title;Yen;2021
                String bookData = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthorName() + ":" + book.getYear();
                bufferedWriter.write(bookData);
                bufferedWriter.newLine();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        //IO try catch
        //Close Resources

    }
}
