public class YCH_2D_Litral {// array of arrays
    public static void main(String[] args) {
        //In array litral We don't need to mention the size of raw and the size of column.
        // array Declaration
        int[][] arr ={// internally the size is fixed
            {1,2,3,4}, // 0th object # first row consider the elements as column
            {5,6,7,8,9},{10,11,12,13},{14,15,16}// all the block of array store inside the heap memory are all actually individual object
        };
        // output
        for (int i=0;i<arr.length;i++) {// print row, i=row, array.length = 4 {If we don't introduce this line, then it will stop looping.in the object containing 1234. After then it will know it right now.}
           for (int j=0;j<(arr[i].length);j++){// print column, j=column , arr[i].length= 4,5,4,3

            System.out.print(arr[i][j]+" ");

          // System.out.println((arr[j].length));
        }
        System.out.println();

        //System.out.println((arr[i].length));
        //System.out.println((arr.length));
        
    }
    System.out.println(arr[2][0]);

 

}
}
