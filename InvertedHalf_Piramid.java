// Print the pattern 

/**
 * InvertedHalf_Piramid


*****
****
***
**
*

 */
public class InvertedHalf_Piramid {
    public static void main(String[] args) {
        for (int i = 5; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}