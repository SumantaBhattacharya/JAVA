// mrthod overloading means just chaing the arguments or parameters to make it differ from any other methods under same class having the same name
public class MOverLoading_ych {
    /*A class contains more than one method with the same name. Is called as method overloading
     * One number of parameters  
     * 2 order of parameters 
     * 3 data type of parameters
     * Q)We overload the method by just changing the return type
 * NO, we cannot. It will give us compile time error due to ambiguity problem.
  We only impliment overloading, When we make changes in the paremeters of the method
     */

   int a,b;
   //1. Default method with no parameters
   void sum(){
    a=68;
    b=1;
    System.out.println(a+b);
   }
   // 2.non static Method with two integer parameters (overloaded)
   void sum(int x, int y) {
    a = x;
    b = y;
    System.out.println(a + b);
  }
   //3.non static Method with three integer parameters (overloaded)
  void sum(int x,int y , int z){
  System.out.println(x+y+z);
  }
  //4.non static Method with an integer and a double parameter (overloaded)
  void sum (int x , double y){
  System.out.println(x+y);
  }
public static void main(String[] args) {
  // we need to create objects of each method
  MOverLoading_ych t1 = new MOverLoading_ych();
  t1.sum();//1. Default method with no parameters
 t1.sum(67,1);// 2.non static Method with two integer parameters (overloaded)
 t1.sum(416,3,1);
 t1.sum(6,.9);//4.non static Method with an integer and a double parameter (overloaded)
}

}
