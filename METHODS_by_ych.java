/*Different type of methods inside the class
        in Java,a method is like a function which is used to expose the behavior of an object.
        methods:
        1)a methods may not take any take any parameter. 
        |2) method may take parameters. 
        |Three. A method return some values
        |four. a method may not return values.
        */
public class METHODS_by_ych { 
    int a ;
    int b;
 // 1)a methods may not take any take any parameter. 
 void sum(){
    System.out.println(a+b);
 }
 // |2) method may take parameters. 
 void sum (int x , int y){
    a=x;
    b=y;
    System.out.println(a+b);
    
 }
 // |Three. A method return some values
  int sub(){
    return(a-b);
  }
 // Driver code
 public static void main(String[] args) {
    METHODS_by_ych cal = new METHODS_by_ych();
    // 1)a methods may not take any take any parameter. 
   /*  cal.a=69;
    cal.b=68;
    cal.sum();*/
    // |2) method may take parameters. 
 /* cal.sum(69,8);*/

  // |Three. A method return some values
cal.a=6;
cal.b=9;
int r = cal.sub();
System.out.println(r);
  }
}
