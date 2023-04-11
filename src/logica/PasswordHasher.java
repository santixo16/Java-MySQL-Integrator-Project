package logica;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHasher {
    
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Error: " + ex.getMessage());
            return null;
        }
    }
    
}
