// package MCA PROGRAMME-MCA1101 Object Oriented Programming with Java;

// 1. Write a Program to find the sum of the following series
// (d) S= 1! + 2! + 3! + 4!...Up to Nth Term. (Input N). 
public class SumOfFollowingSeries4 {

    // 0! = 1
    // 1! = 1
    // 2! = 2*1 = 2
    // 3! = 3*2*1 = 6
    // 4! = 4*3*2*1 = 24

    public double SumOfTheFollowingSeries() {
        int n = 5;
        long sum = 0;

        long factorial = 1; // as fact of 0! = 1 and 1! = 1

        for (int i = 1; i <= n; i++) {

            factorial *= i;// 1*1=1,1*2=2,2*3=6,6*4=24,24*5=120

            sum = sum + factorial;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfFollowingSeries4 SumOfSeries4 = new SumOfFollowingSeries4();
        System.out.println("Sum of the following series: " + SumOfSeries4.SumOfTheFollowingSeries());
    }
}
