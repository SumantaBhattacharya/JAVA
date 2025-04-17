/*

cd "c:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\DSA in JAVA\" ; if ($?) { javac InvertedHalfPiramid2.java } ; if ($?) { java InvertedHalfPiramid2 }

 Print the pattern 
 Inverted Half Piramid 
 (rotated by 180 deg)

    *
   **
  ***
 ****
***** 
         spaces=n-i       i
----* ↪ 4space(5-1=4) + 1star ➡ 5
---** ↪ 3space(5-2=3) + 2star ➡ 5 
--*** ↪ 2space(5-3=2) + 3star ➡ 5 
-**** ↪ 1space(5-4=1) + 4star ➡ 5
***** ↪ 0space(5-4=0) + 5star ➡ 5

5 no of rows is printing every line
consider 5 as n

n-1 spaces +1
n-2 spaces and 2start
n-3 spaces 3star
n-4 spaces 4star
n-5 spaces 5star


*/

public class InvertedHalfPiramid2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
