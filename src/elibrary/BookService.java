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

/**
 *
 * @author miroslavbalev
 */
public class BookService {
    private static final String BOOKS_FILE = "books.txt";
    
    public ArrayList getBooks() {
        ArrayList<Book> bookArr = new ArrayList<Book>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("<3");
                
                int id = Integer.parseInt(parts[0]);
                String url = parts[1];
                String name = parts[2];
                String category = parts[3];
                String author = parts[4];
                
                Book book = new Book(id, url, name, category, author);
                
                bookArr.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return bookArr;
    }
    
    public ArrayList getBooks(Book b) {
        ArrayList<Book> bookArr = new ArrayList<Book>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("<3");
                
                int id = Integer.parseInt(parts[0]);
                String url = parts[1];
                String name = parts[2];
                String category = parts[3];
                String author = parts[4];
                
                boolean canAdd = true;
                
                if(b.getId() > 0 && b.getId() != id) {
                    canAdd = false;
                }
                
                if(!b.getName().isBlank() && !b.getName().matches(name)) {
                    canAdd = false;
                }
                
                if(!b.getCategory().isBlank() && !b.getCategory().matches(category)) {
                    canAdd = false;
                }
                
                if(!b.getAuthor().isBlank() && !b.getAuthor().matches(author)) {
                    canAdd = false;
                }
                
                if(canAdd) {
                    Book book = new Book(id, url, name, category, author);
                
                    bookArr.add(book);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return bookArr;
    }
    
    public boolean createBook(String url, String name, String category, String author) {
        int nextId = getNextId();
        
        if(nextId == -1) {
            return false; //Failed to get the next ID
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKS_FILE, true))) {
            String bookRecord = nextId + "<3" + url + "<3" + name + "<3" + category + "<3" + author;
            writer.write(bookRecord);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteBook(int bookId) {
        try {
            File inputFile = new File(BOOKS_FILE);
            File tempFile = new File("books_temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String[] parts = currentLine.split("<3");
                
                if(parts.length == 5) {
                    if(Integer.parseInt(parts[0]) != bookId) {
                        writer.write(currentLine);
                        writer.newLine();
                    }
                }
                
            }

            reader.close();
            writer.close();

            //delete the original file
            if (inputFile.delete()) {
                // rename the temporary file to the original file name
                if (tempFile.renameTo(inputFile)) {
                    return true; //success
                } else {
                    return false; //failed to rename the temporary file
                }
            } else {
                return false; // failed to delete the original file
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private int getNextId() {
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE))) {
            String line;
            int maxId = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("<3");

                if(parts.length == 5) {
                    int id = Integer.parseInt(parts[0]);
                    maxId = Math.max(maxId, id);
                }
            }
            
            return maxId + 1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
