package start;
import java.util.Random;

public class OTPGenerator {
    public static String generateOTP(int digit) {
        String num = "0123456789";
        StringBuilder otp = new StringBuilder();
        Random random = new Random();
        
        for (int i = 1; i <= digit; i++) {
            otp.append(num.charAt(random.nextInt(num.length())));
        }
        
        return otp.toString();
    }
    
    public static void main(String[] args) {
        int numberOfDigits = 6;
        // Change this value to generate OTP of different lengths
        System.out.println("Generated OTP: " + generateOTP(numberOfDigits));
    }
}
