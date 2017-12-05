import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Base64;

public class PasswordUtil {    
    public static String hashPassword(String password)
            throws NoSuchAlgorithmException {        
       //SHA-256 is the algorithm used here for encryption. 
    	//this fucntion is taken as it is from Murach JSP and Servlet
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(password.getBytes());
        byte[] mdArray = md.digest();
        StringBuilder sb = new StringBuilder(mdArray.length * 2);
        for (byte b : mdArray) {
            int v = b & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
           }        
           return sb.toString();        
       }
    
       // for simplicity salt is the same for all passwords
       public static String getSalt() {

    	   return "KIng";
       }
       
       
       public static String hashAndSaltPassword(String password)
               throws NoSuchAlgorithmException {
           String salt = getSalt();
           return hashPassword(password + salt);
       }
       /*  This code tests the functionality of this class.
        */    
        public static void main(String[] args) {
            try {
                System.out.println("Hash for 'sesame'       : "
                        + hashPassword("ew"));
                System.out.println("Random salt             : "
                        + getSalt());
                System.out.println("Salted hash for 'as': "
                        + hashAndSaltPassword("as"));
            } catch (NoSuchAlgorithmException ex) {
                System.out.println(ex);
            }
        }
    }
