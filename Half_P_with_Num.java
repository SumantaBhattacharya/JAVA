/*
  
 Half Piramid with Number

 Print the pattern
 
n=5

 1     <--- rowno = 1  no 1 to 1  
 12    <--- rowno = 2  no 1 to 2
 123   <--- rowno = 3  no 1 to 3
 1234  <--- rowno = 4  no 1 to 4
 12345 <--- rowno = 5  no 1 to 5
                       for(i<=n)
                       for(j <= i)
                       print(j) rowno = 1  =  no 1 to 1  
                                rowno = 2  =  no 1 to 2
                                rowno = 3  =  no 1 to 3
                                rowno = 4  =  no 1 to 4
                                rowno = 5  =  no 1 to 5

I   J
i=1 1
i=2 12
i=3 123
i=4 1234
i=5 12345


*/

public class Half_P_with_Num {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.err.print(j);
            }
            System.err.println();
        }
    }
}
/*

Dry run 

step-1------------------------------------------------------

 for (int i = 1; 1 <= 5; i++) { ✅
            for (int j = 1; 1 <= 1; j++) {✅
                System.err.print(1);
            }
            System.err.println();
        }

output = 1

 for (int i = 1; 1 <= 5; i++) { ✅
            for (int j = 2; 2 <= 1; j++) {❎
                System.err.print(1);
            }
            System.err.println();
        }
// the loop stil in the inner loop 

final output = 1

step-2--------------------------------------------------

 for (int i = 2; 2 <= 5; i++) { ✅
            for (int j = 1; 1 <= 2; j++) {✅
                System.err.print(1);
            }
            System.err.println();
        }

output = 1

 for (int i = 2; 2 <= 5; i++) { ✅
            for (int j = 2; 2 <= 2; j++) {✅
                System.err.print(2);
            }
            System.err.println();
        }

output = 2

 for (int i = 2; 2 <= 5; i++) { ✅
            for (int j = 3; 3 <= 2; j++) {❎
                System.err.print();
            }
            System.err.println();
        }

final output = 12

step-3--------------------------------------------------

 for (int i = 3; 3 <= 5; i++) { ✅
            for (int j = 1; 1 <= 3; j++) {✅
                System.err.print(1);
            }
            System.err.println();
        }

output = 1

  for (int i = 3; 3 <= 5; i++) { ✅
            for (int j = 2; 2 <= 3; j++) {✅
                System.err.print(2);
            }
            System.err.println();
        }
 
output = 2
            
  for (int i = 3; 3 <= 5; i++) { ✅
            for (int j = 3; 3 <= 3; j++) {✅
                System.err.print(3);
            }
            System.err.println();
        }

output = 3

  for (int i = 3; 3 <= 5; i++) { ✅
            for (int j = 4; 4 <= 3; j++) {❎
                System.err.print();
            }
            System.err.println();
        }

finaloutput = 123

step-4--------------------------------------------------

 */