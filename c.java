public class c {

public static void main(String args[])
{
int i = 0;
boolean t = true;
boolean f = false;
boolean b;
b = (t | ((i++) == 0));//i=1.the bitwise OR operator |(i++) == 0 checks if i is equal to 0 before incrementing it. Since i is initially 0, this expression evaluates to true.
//t | true performs a bitwise OR operation between t (true) and the result of the previous expression (true). The result is true.So, b is assigned the value true.
b = (f | ((i+=2) > 0));//i=i+2=3,Since 3 is greater than 0, this expression evaluates to true.f | true performs a logical OR operation between f (false) and the result of the previous expression (true). The result is true.
//So, b is assigned the value true again, overwriting the previous value.
System.out.println(i);
System.out.println(b);
}

}