
/* 2. Print the pattern - Hollow Reactrangle

 *****
 *   *
 *   *
 *****

 (1,1)(1,2)(1,3)(1,4)(1,5)
 (1,1)***** i=1
 (2,1)*   * i=2
 (3,1)*   * i=3
 (4,1)***** i=4
    j=1 j=2 j=3 j=4 j=5

    Print star for first or last row or for first or last column, otherwise print blank space.
    After printing all columns of a row, print new line after inner loop.
    i=1 *(1,1)
        *(2,1)
        *(3,1)
        *(4,1)
    j=1 *****(1,1)(1,2)(1,3)(1,4)(1,5)
    i=4 *****(4,1)(4,2)(4,3)(4,4)(4,5)
    

*/

public class Hollow_Rectangle{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { //nested loops  
            for(int j=1; j<=5;j++){
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    }
}

/*
 Dry run
 --------

 step-1----------------------------------------------

         for (int i = 1; i <= 4; i++) { ✅
            for(int j=1; j<=5;j++){✅
                     ✅      ✅
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    output- *
    the loop still in the inner loop 

     for (int i = 1; i <= 4; i++) { ✅
            for(int j=2; j<=5;j++){ ✅
                //    ✅     no need to check other conditions
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    output- *

         for (int i = 1; i <= 4; i++) { ✅
            for(int j=3; j<=5;j++){ ✅
                //    ✅     no need to check other conditions
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    output- *

    for (int i = 1; i <= 4; i++) { ✅
            for(int j=4; j<=5;j++){ ✅
                //    ✅     no need to check other conditions
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    output- *

        for (int i = 1; i <= 4; i++) { ✅
            for(int j=5; 5<=5;j++){ ✅
                //    ✅     no need to check other conditions
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    output- *

            for (int i = 1; i <= 4; i++) { ✅
            for(int j=6; 6<=5;j++){ ❎ // the loop will end here andth econtrol will pass to the outter loop
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

    final output- *****

    step-2--------------------------------------------------------

    for(i=2;i<=4;i++){✅
      for(j=1;j<=5;j++){✅
            ❎      ✅    no need to check any other conditions
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

    output- *

     for(i=2;2<=4;i++){✅
      for(j=2;3<=5;j++){✅
      //    ❎      ❎      ❎     ❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

    output- " "

    for(i=2;2<=4;i++){✅
      for(j=3;3<=5;j++){✅
       //    ❎      ❎      ❎     ❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

    output- " "

     for(i=2;2<=4;i++){✅
      for(j=4;4<=5;j++){✅
       //    ❎      ❎      ❎     ❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output- " "

     for(i=2;2<=4;i++){✅
      for(j=5;5<=5;j++){✅
       //    ❎      ❎      ❎     ✅
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output- *

     for(i=2;2<=4;i++){✅
      for(j=6;6<=5;j++){❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }
    
final output for the row - *   *
next line

step-3-------------------------------------------------------------

for(i=3;3<=4;i++){✅
      for(j=1;1<=5;j++){✅
      //     ❎     ✅      no need to check anyother conditions
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output- *

for(i=3;3<=4;i++){✅
      for(j=2;2<=5;j++){✅
      //     ❎     ❎      ❎      ❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output - " "

for(i=3;3<=4;i++){✅
      for(j=3;3<=5;j++){✅
      //     ❎     ❎      ❎      ❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output - " "

for(i=3;3<=4;i++){✅
      for(j=4;4<=5;j++){✅
      //     ❎     ❎      ❎      ❎
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output - " "

for(i=3;3<=4;i++){✅
      for(j=5;5<=5;j++){✅ 
      //     ��     ��      ��   ✅
        if (i==1 || j==1 || i==4 || j==5){
            System.out.print("*");
        } else{
            System.out.print(" ");
        }
            
      }
      System.out.println();
    }

output- "*"

final out put for row - *   *

step-4-------------------------------------------------------------

for (int i = 4; 4 <= 4; i++) { ✅
            for(int j=1; 1<=5;j++){✅
            //       ❎     ✅      no need to check any other conditions
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }

output- *

 */

/*  College life journey

    1st sem
    c basics                             -College
    Digital Electronics                  -Youtube(ALL ABOUT ELECTRONICS)
    Soft Skills                          -College
    Mathematics for Computing            -NCERT Wallah


    2nd sem
    c basics                             -Youtube(Youth Career Hub) + Youtube(Programiz) 
    python basics                        -Youtube(Youth Career Hub) + Youtube(Programiz)
    
    Computer Architecture                -Youtube(Gate Smashers)
    Discrete Strcuture                   -College
    Professional Communication           -College
    Environmental Science                -College
    
    3rd sem
    dsa in python                        -Youtube(Amulya's academy)
    java                                 -Youth Career Hub(Core java(Course-1500)) +
    oops                                 -Youth Career Hub +
    sql                                  -Youth Career Hub +
    git & github                         -Youth Career Hub

    Operating system                     -Youtube(Neso Academy)
    Climate Change and Health            -College

    4th sem
    Database Management System           -Youtube(Gate Smashers)
    Software Engineering                 -Youtube(Gate Smashers)
    Design and Analysis of Algorithms    -Youtube(Gate Smashers + Abdul Bari)
    Project Management                   -College

    html                                 -Youtube(Apna College)
    css                                  -Youtube(Apna College)
    js                                   -Youtube(Chai aur Code)
    gsap                                 -Youtube(Sheryians Coding School)
    locomotive scroller                  -Youtube(Sheryians Coding School)
    swipper.js                           -Youtube(Sheryians Coding School)
    node                                 -(Apna College(Delta(Course-5000))) +
    Express                              -Apna College +
    git & github                         -Apna College +
    sql                                  -Apna College 
    

*/ 

