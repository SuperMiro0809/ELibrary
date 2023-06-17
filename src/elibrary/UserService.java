/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author miroslavbalev
 */
public class UserService {
    private static final String USERS_FILE = "users.txt";
    
    public UserState authenticate(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 4 && parts[1].equals(username)) {
                    String storedPassword = parts[2];
                    String hashedPassword = hashPassword(password);
                    if(storedPassword.equals(hashedPassword)) {
                        UserState user = new UserState(Integer.parseInt(parts[0]), parts[1], parts[3]);
                        return user;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public UserState register(String username, String password) {
        int nextId = getNextId();
        
        if(nextId == -1) {
            return null; //Failed to get the next ID
        }
        
        String hashedPassword = hashPassword(password);
        if(hashedPassword == null) {
            return null; //Failed to hash the password
        }
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
            String userRecord = nextId + ":" + username + ":" + hashedPassword + ":" + "User";
            writer.write(userRecord);
            writer.newLine();
            UserState user = new UserState(nextId, username, "User");
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private int getNextId() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            int maxId = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");

                if(parts.length == 4) {
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
    
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                stringBuilder.append(String.format("%02x", hashedByte));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
