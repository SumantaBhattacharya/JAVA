/*& 'C:\Program Files\Java\jdk-22\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsI
nExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\AppData\Roaming\Code\User\workspaceStorage\36e6ac498a2a10d67a6687f8692a124b\redhat.j
ava\jdt_ws\JAVA 4 DSA_3a754290\bin' 'Half_Piramid'

 3. Print the Pattern -Half Piramid

 *    1st row = 1star
 **   2nd row = 2star
 ***  3rd row = 3star
 **** 4th row = 4star
 row now = total columns

 ^   i=1(i++(i=2)) 1<=5 ✔ 
 |   j=1(j++(j=2))  1<=1
 |   * 
 |   println(nextline)

 ^   i=2(i++(i=3)) 2<=5 ✔ 
 |   j=1 * j=2 * j=3 3<=2❌
 |   **
 |   println(nextline)



 */

 /*

  *
  **
  ***
  ****
  *****
  
  */

public class Half_Piramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*  College life journey

    1st sem
    c basics

    2nd sem
    c basics            -College + Youtube(Programiz)
    python basics       -Youtube(Programiz)
    
    3rd sem
    dsa in python        -Youtube(Amulya's academy)
    java                 -Youth Career Hub(Core java(Course-1500)) +
    oops                 -Youth Career Hub
    sql                  -Youth Career Hub
    git & github         -Youth Career Hub

    4th sem
    html                 -Youtube(Apna College)
    css                  -Youtube(Apna College)
    js                   -Youtube(Chai aur Code)
    gsap                 -Youtube(Sheryians Coding School)
    locomotive scroller  -Youtube(Sheryians Coding School)
    swipper.js           -Youtube(Sheryians Coding School)
    node                 -(Apna College(Delta(Course-5000))) +
    Express              -Apna College
    git & github         -Apna College
    sql                  -Apna College


*/ 