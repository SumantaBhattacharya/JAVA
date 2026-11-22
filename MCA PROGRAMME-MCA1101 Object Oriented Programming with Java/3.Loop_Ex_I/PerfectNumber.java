public class PerfectNumber {
    // 4. Write a program for determining whether a number is a Perfect number or not.(e.g. 28 is a Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)

    // Divisors of 24 are 1 2 3 4 6 8 12 24, the sum of these is 60. then 24 is not a perfect number.
    public static boolean isPerfectNumber(int num){
        // 0 and 1 are not perfect numbers
        if (num <= 1) {
            return false;
        };

        long sumOfDivisors = calculateSumOfDivisors(num);
        
        // Compare the sum of proper divisors is to the original number
        return sumOfDivisors == num;
    }

    // Method to find the sum of proper divisors (excluding the number itself).
    public static long calculateSumOfDivisors(long num) {
        long sum = 0;

        for (long i = 1; i <= num - 1; i++) {// excluding the number itself
            if (num % i == 0) { // devisors
                sum = sum + i; // then sum
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {28, 24, 6, 67, 68, 69, 420};

        for (int num : nums) {
            if (isPerfectNumber(num)) {
                System.out.println(num + " is a Perfect Number.");
            } else {
                System.out.println(num + " is not a Perfect Number.");
            }
        }

    }

}
