import java.util.Scanner;

public class Main_A3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to play? : ");
        int x = input.nextInt();
        int b;

        switch (x % 3) {
            case 0:
                b = 1;
                choice(b, x);
                break;
            case 1:
                b = 1;
                System.out.println("Computer choice: " + b);
                choice(b + 1, x);
                break;
            case 2:
                b = 2;
                System.out.println("Computer choice: " + (b - 1) + " and " + b);
                choice(b + 1, x);
                break;
        }
    }

    static void choice(int j, int x) {
        int b = 0;
        while (j <= x) {
            int i = 0, k = j;
            Scanner input1 = new Scanner(System.in);
            System.out.println("User choice:");
            System.out.print("How many numbers do you want to put among 1 and 2 numbers: ");
            int a = input1.nextInt();

            if (a == 1 || a == 2) {
                k = j;
                while (i < a) {
                    System.out.print("Enter " + (i + 1) + " no data: ");
                    b = input1.nextInt();
                    if (b != k) {
                        System.out.println("Enter valid input.");
                    } else {
                        k++;
                        i++;
                    }
                }

                if (b == x) {
                    System.out.println("User is the winner");
                    break;
                }

                if (a == 1) {
                    System.out.println("Computer choice: " + (b + 1) + " and " + (b + 2));
                    if ((b + 2) == x) {
                        System.out.println("Computer is the winner.");
                        break;
                    } else {
                        j = b + 3;
                    }
                }

                if (a == 2) {
                    System.out.println("Computer choice: " + (b + 1));
                    if ((b + 1) == x) {
                        System.out.println("Computer is the winner.");
                        break;
                    } else {
                        j = b + 2;
                    }
                }
            } else {
                System.out.println("Enter valid input.");
            }
        }
    }
}

/*How many numbers do you want to play? : 10
Computer choice: 1 and 2
User choice:
How many numbers do you want to put among 1 and 2 numbers: 2
Enter 1 no data: 1
Enter 2 no data: 2
Computer choice: 3 and 4
User choice:
How many numbers do you want to put among 1 and 2 numbers: 1
Enter 1 no data: 3
Computer choice: 4 and 5
User choice:
How many numbers do you want to put among 1 and 2 numbers: 2
Enter 1 no data: 4
Enter 2 no data: 5
User is the winner*/

