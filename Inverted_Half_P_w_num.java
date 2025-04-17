/**
 * Inverted_Half_P_w_num
 
 Print the pattern - Inverted Half Piramid with Numbers

 12345
 1234 
 123
 12
 1  

 */
public class Inverted_Half_P_w_num {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}
