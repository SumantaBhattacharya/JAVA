public class c2 {
public static void main(String args[])
{
boolean x = true;
int a;
if(x) a = x ? 1: 2;//x is true, it evaluates to 1 So, a is assigned the value 1.
//If x were false, it would execute the else block, and then the ternary operator inside the else block (x ? 3 : 4;) would determine the value to assign to a.
else a = x ? 3: 4;
System.out.println(a);
}
}

