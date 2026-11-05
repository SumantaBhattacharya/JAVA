// package MCA PROGRAMME-MCA1101 Object Oriented Programming with Java;
public class SumOfFollowingSeries3 {
    // 1. Write a Program to find the sum of the following series 
    // (c) S=  1 - 1/3 + 1/9 - 1/27 + 1/81 - 1/243 …. Up to Nth Term. (Input N). 
    public double SumOfTheFollowingSeries() {

        // for i=1 odd +, it's 1/3^0 = 1;
        // for i=2 even -, it's 1/3^1 = 1/3;
        // for i=3 odd +, it's 1/3^2 = 1/9;
        // for i=4 even -, it's 1/3^3 = 1/27;

        int n = 4;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {//even
                sum = sum - 1/Math.pow(3, i - 1);
            } else {
                sum = sum + 1/Math.pow(3, i - 1);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfFollowingSeries3 series = new SumOfFollowingSeries3();
        System.out.println("Sum of the following series: " + series.SumOfTheFollowingSeries());
    }
}
