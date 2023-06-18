/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author miroslavbalev
 */
public class UserBookService {
    private static final String USER_BOOKS_FILE = "user_books.txt";
    private static final String BOOKS_FILE = "books.txt";
    
    public ArrayList<Book> getUserBooks(int userId) {
        ArrayList<Book> bookArr = new ArrayList<Book>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_BOOKS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("<3");
                
                if(parts.length == 2 && Integer.parseInt(parts[0]) == userId) {
                    int bookId = Integer.parseInt(parts[1]);
                    
                    try (BufferedReader bookReader = new BufferedReader(new FileReader(BOOKS_FILE))) {
                        String bookLine;
                        while ((bookLine = bookReader.readLine()) != null) {
                            String[] bookParts = bookLine.split("<3");
                            
                            if(bookParts.length == 5 && Integer.parseInt(bookParts[0]) == bookId) {
                                int id = Integer.parseInt(bookParts[0]);
                                String url = bookParts[1];
                                String name = bookParts[2];
                                String category = bookParts[3];
                                String author = bookParts[4];

                                Book book = new Book(id, url, name, category, author);

                                bookArr.add(book);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return bookArr;
    }
    
    public int addBookToUser(int bookId,  int userId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_BOOKS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("<3");
                
                if(parts.length == 2) {
                    if(Integer.parseInt(parts[0]) == userId &&
                       Integer.parseInt(parts[1]) == bookId
                    ) {
                        return 409; //conflict
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_BOOKS_FILE, true))) {
            String userBookRecord = userId + "<3" + bookId;
            writer.write(userBookRecord);
            writer.newLine();
            
            writer.flush();
            writer.close();
            return 200;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public boolean removeBookFromUser(int bookId, int userId) {        
        try {
            File inputFile = new File(USER_BOOKS_FILE);
            File tempFile = new File("user_books_temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] parts = currentLine.split("<3");
                
                if(parts.length == 2) {
                    if(Integer.parseInt(parts[0]) != userId ||
                       Integer.parseInt(parts[1]) != bookId
                    ) {
                        writer.write(currentLine);
                        writer.newLine();
                    }
                }
                
            }

            reader.close();
            writer.close();

            //Delete the original file
            if (inputFile.delete()) {
                // Rename the temporary file to the original file name
                if (tempFile.renameTo(inputFile)) {
                    System.out.println("Line deleted successfully.");
                    return true;
                } else {
                    System.out.println("Failed to rename the temporary file.");
                    return false;
                }
            } else {
                System.out.println("Failed to delete the original file.");
                 return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
