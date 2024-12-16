public class Suggestions {
    public static void main(String[] args) {
        int[] A = {0, 2, 4, 1, 3}; 
        for (int i = 0; i < A.length; i++) { 
            A[i] = A[(A[i] + 3) % A.length]; 
        }

        // Print the updated array for verification
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
/*
3)5(1
  3
____
2 */
