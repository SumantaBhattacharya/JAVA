// Write a program to make a Salary Calculator (Taking one Input: Basic calculate the DA,HRA 
// and Total Pay). 

class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 43000.0;

        double da = salary * 0.40;   // 40% DA
        double hra = salary * 0.20;  // 20% HRA
        double totalPay = salary + da + hra;

        System.out.println("Basic Salary = " + salary);
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Total Pay = " + totalPay);
    }
}