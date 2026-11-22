public class SumEvenOdd {

    // 5. Write a program to find the sum of all the Even and Odd numbers between 1 and 100.
    public static int[] sumEvenOdd() {
        int SumEven = 0;
        int SumOdd = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {//even
                SumEven = SumEven + i;
            } else {//odd
                SumOdd = SumOdd + i; 
            }
        }

        // In Java, you cannot return two values separated by a comma. A Java method can only return one single thing.
        int[] nums = {SumEven, SumOdd};
        return nums;
    }

    public static void main(String[] args) {
        int[] result = sumEvenOdd();
        System.out.println("The sum of even and odd numbers up to 100 is: " + result[0] + " (Even) and " + result[1] + " (Odd)");
    }

}
