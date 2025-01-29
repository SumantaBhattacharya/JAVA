import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_LITRAL6 {
    public static void main(String[] args) {
        //int [] arr= {10,90,89,98,88};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        int [] arr = new int[5];
        //input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
 
        change(arr);//method call
        System.out.println(Arrays.toString(arr));
    sc.close();}

static void change(int [] arr)
{
    arr[0]=99;
    arr[1]=96;


    }
} 