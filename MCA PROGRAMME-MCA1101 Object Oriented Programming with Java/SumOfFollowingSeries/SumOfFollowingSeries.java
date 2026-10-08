public class SumOfFollowingSeries{
    // 1. Write a Program to find the sum of the following series 
    // (a) S= -2 + 4 - 6 + 8 - . . . . . ...... Up to Nth Term. (Input N). 

    // N^th 1 - 2
    //      2 - 4
    //      3 - 6
    //      4 - 8

    public int SumOfTheFollowingSeries() {
        // an = a + (n-1) d (Arithmetic progression)
        // 2 + (n-1) 2 = 2 + 2n - 2 =  2 - 2 + 2n = 0 + 2n = 2n
        // 2, 4, 6, 8, …
        // 2×1, 2×2, 2×3, 2×4, …
        // So for term number n, the magnitude is: 2n

        // signs
        // n=1 → negative
        // n=2 → positive
        // n=3 → negative
        // n=4 → positive
        // So:
        // Odd n → negative
        // Even n → positive

        // The n-th term is:
        // If n is odd: −2n
        // If n is even: +2n

        // If user enters N = 4, add the first 4 terms: −2+4−6+8=4 (-2+4 = +2 & −6+8 = +2)

        int N = 4;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i%2 == 0) {// n is i
                sum = sum + 2 * i;
            }else{
                sum = sum - 2 * i; 
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        SumOfFollowingSeries SumSeries = new SumOfFollowingSeries();
        int sum = SumSeries.SumOfTheFollowingSeries();
        System.out.println("Sum = " + sum);
    }
}