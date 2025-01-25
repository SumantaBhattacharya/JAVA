public class COverLoading_ych { 
   int a=0;
   int b=0;
   double c=0.0;

 //1st. Default Constructor 
 COverLoading_ych (){
   a=69;
   b=30;
   c=5;
 }

 //2nd. Constructor with Two Integer Parameters
  COverLoading_ych (int x, int y){
  a=x;     // Set 'a' to the value of parameter 'x'
  b = y;   // Set 'b' to the value of parameter 'y'
// 'c' remains 0.0 since it's not explicitly set here
 }

//3rd. Constructor with One Integer and One Double Parameter
 COverLoading_ych (int x, double y){
 a=x;// Set 'a' to the value of parameter 'x'
 c=y; // Set 'c' to the value of parameter 'y'
 // 'b' remains 0 since it's not explicitly set here
  
 }
 
//4rh. Constructor with Two Integer Parameters and One Double Parameter
 COverLoading_ych  (int x, int y,double z){
 a=x;// Set 'a' to the value of parameter 'x'
 b=y;
 c=z; 
 } 

//5th.Constructor with One Integer, One Double, and One Integer Parameter
 COverLoading_ych  (int x,double y,int z){
 a=x;
 c=y;
 b=z;
 }

 void display(){
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
 }
 public static void main(String[] args) {
   COverLoading_ych T1 = new COverLoading_ych();//1st. Default Constructor 
   T1.display();
   COverLoading_ych T2 = new COverLoading_ych(68,1);
   T2.display();
   COverLoading_ych T3 = new COverLoading_ych(6,.9);
   T3.display();
   COverLoading_ych T4 = new COverLoading_ych(6,9,0.9);
   T4.display();
   COverLoading_ych T5 = new COverLoading_ych(6,0.9,8);
   T5.display();
 }
 
}
/*This keyword in Java 
methods to use 'this' in java
1 using the' this' keyword to refer to current class instance variables.
Two using 'this() 'keyword to invoke the current class constructor.
 3 using this to call the current class method. */