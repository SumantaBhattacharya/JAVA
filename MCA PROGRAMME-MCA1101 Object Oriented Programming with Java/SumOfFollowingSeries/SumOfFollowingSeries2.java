// package MCA PROGRAMME-MCA1101 Object Oriented Programming with Java;

// 1. Write a Program to find the sum of the following series 
// (b) S=  1 – 3^2 + 5^3 – 7^4 + . .Up to Nth Term (Input N). 
public class SumOfFollowingSeries2 {

    public double SumOfTheFollowingSeries() {
        // 2×i gives even number
        // 2*i - 1 gives odd number
        // for i=1 odd +, it's 1^1 = 1; 
        // for i=2 even -, it's 3^2 = 3*3 = 9;
        // for i=3 odd +, it's 5^3 = 5*5*5 = 25*5 = 125;
        // for i=4 even -, it's 7^4 = 7*7*7*7 = 2401;

        int n = 4;
        double sum = 0;

        // Math.pow() always returns a double (a decimal)
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {//even
                sum = sum - Math.pow((2 * i - 1), i);
            } else {
                sum = sum + Math.pow((2 * i - 1), i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfFollowingSeries2 SumOfSeries2 = new SumOfFollowingSeries2();
        System.out.println("Sum of the following series: " + SumOfSeries2.SumOfTheFollowingSeries());
    }
}

// Sum = 1 - 9 + 125 - 2401 = -2284.0
