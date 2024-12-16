

public class PrimeNumber {
    public static void main(String[] args) {
        int a, b, i, j;
        a = 10;
        b = 20;
        for (i = a; i <= b; i++) {// starts from 10 upti limit 20
            for (j = 2; j <= i; j++) {// prime number starts from 2 because 1 is not a prime number 
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
 }
}

/*
10%2==0 T
break
11%3==0 F
11==1=T
11==2=F
11==3=F
11==4=F
11==5=F
11==6=F
11==7=F
11==8=F
11==9=F
11==10=F
11==11=t
It is a prime number because it is only divisible by itself  and 1 not by any other number
12%4==0 True
break
13%5==0 False
13==1=T
13==2=F
13==3=F
13==4=F
13==5=F
13==6=F
13==7=F
13==8=F
13==9=F
13==10=F
13==11=F
13==12=F
13==13=T
It is a prime number because it is only divisible by itself  and 1 not by any other number
14%6==0 True
break
15%7==0 false
15==1=T
15==2=F
15==3=F
15==4=F
15==5=F
15==6=F
15==7=F
15==8=F
15==9=F
15==10=F
15==11=F
15==12=F
15==13=F
15==14=F
15==15=T
16%8==0 true
break;
17%9==0 false
17==1=T
17==2=F
17==3=F
17==4=F
17==5=F
17==6=F
17==7=F
17==8=F
17==9=F
17==10=F
17==11=F
17==12=F
17==13=F
17==14=F
17==15=F
17==16=F
17==17=T
18%10==0 false
18==1=T
18==2=t
18==3=t
18==4=F
18==5=F
18==6=t
18==7=F
18==8=F
18==9=T
18==10=F
18==11=F
18==12=F
18==13=F
18==14=F
18==15=F
18==16=F
18==17=F
18==18=F
It is not a prime number
19%10==0 false
19==1=T
19==2=F
19==3=F
19==4=F
19==5=F
19==6=F
19==7=F
19==8=F
19==9=F
19==10=F
19==11=F
19==12=F
19==13=F
19==14=F
19==15=F
19==16=F
19==17=F
19==18=F
19==19=T
20%20==T
break;
Certainly, let's go through the code step by step to understand why it outputs 11, 13, 17, and 19 in the range of 10 to 20:

1. The outer loop starts with i at 10 and goes up to 20 because a is 10, and b is 20.

2. The inner loop, for each value of i, checks if i is divisible by any number j from 2 to i.

3. If i is divisible by any number j within this range (i.e., i % j == 0), it breaks out of the inner loop because finding a divisor means i is not a prime number.

4. After the inner loop, it checks if i is equal to j. If it is, that means the inner loop did not find any divisors other than 1 and i itself, which is a prime number characteristic.

So, for each value of i in the range of 10 to 20:

- When i is 11, it is not divisible by any number between 2 and 11, so it satisfies the condition if (i == j) and is printed as a prime number.

- When i is 13, it is not divisible by any number between 2 and 13, so it satisfies the condition if (i == j) and is printed as a prime number.

- When i is 15, it is divisible by 3 (15 % 3 == 0), so it is not considered a prime number, and it's not printed.

- When i is 17, it is not divisible by any number between 2 and 17, so it satisfies the condition if (i == j) and is printed as a prime number.

- When i is 19, it is not divisible by any number between 2 and 19, so it satisfies the condition if (i == j) and is printed as a prime number.

This is why the output of the code is 11, 13, 17, and 19, as these are the prime numbers within the specified range. */

    }

