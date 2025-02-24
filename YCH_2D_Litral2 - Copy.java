import java.util.Arrays;
public class YCH_2D_Litral2 {// array of arrays
    public static void main(String[] args) {
        //In array litral We don't need to mention the size of raw and the size of column.
        // array Declaration
        int[][] arr ={// internally the size is fixed
            {1,2,3,4}, // 0th object # first row consider the elements as column
            {5,6,7,8,9},{10,11,12,13},{14,15,16}// all the block of array store inside the heap memory are all actually individual object
        };
        // output - foreachloop
         for (int [] a : arr ){ // reference variable always stored inside the stack memory, inside the stack memory a memory is created for arr which is responsble to point 2d object which is created inside the heap
            System.out.println(Arrays.toString(a));// in java, whatever starting with a capital letter is a class, press control and right click
         }
        System.out.println(arr[2][0]);// printing each element of 2d array
        arr [0][1]=60; // update
 System.out.println(arr[0][1]);
        for (int [] a : arr ){ // printing the array after updating
            System.out.println(Arrays.toString(a));
         }

}
}

