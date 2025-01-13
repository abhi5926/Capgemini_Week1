public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (6-digit number)
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Loop through all OTPs and compare each one with every other OTP
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;  // If a duplicate is found, return false
                }
            }
        }
        return true;  // If no duplicates are found, return true
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicated.");
        }
    }
}
