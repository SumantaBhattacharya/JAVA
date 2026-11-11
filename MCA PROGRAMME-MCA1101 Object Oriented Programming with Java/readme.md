- # **Notes**
  - # **Datatype**
    - `Whole numbers only` → `int` 
    - `Fractions/decimals` → `double`

  - `Method` *name should start with* `lowercase`

  - `Math.round` *gives `whole number`*
  - *Only* `printf` *understands* `%` `placeholders`.
  - `printf` *doesn't use* + `concatenation`. *Uses* `,`
  - `Math.sqrt()` *in* `Java` *is designed to work only with* `real non-negative numbers`.
  - `local variables` do not get `default values`
  - sc.next(), .trim() is unnecessary because next() already skips whitespace and stops at the first whitespace. 

  - Quadratic formula: x = $$ x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a} $$
    - discriminant = $$ D = b^2 - 4ac $$
    - If the discriminant is greater than 0
      - i. x = (-b + √(b^2 - 4ac)) / 2a 
      - ii. x = (-b - √(b^2 - 4ac)) / 2a
    - If the discriminant is equal to 0
      i. x = (-b ± √(0)) / 2a => -b / 2a
    - If the discriminant is less than 0
      - x = (-b ± √(b^2 - 4ac)) / 2a
        - When D is becoming less than 0, such as -1, -2, -9, etc., since is negative, -D is positive (negative of a negative number is positive), -D is greater than 0 as D is already negative
          - D is (b^2 - 4ac) 
          - x = (-b ± √-1.(-D)) / 2.a
          - property applied 
          - √a*b = √a * √b
          - √-1 . √-D
          - i = √-1
          - x = (-b ± i . √-D) / 2.a
          - property applied 
          - p ± q.i
            - i. p + q.i
            - ii. p - q.i
          - q = √-D
          - x = (-b ± q.i) / 2.a
          - (-b / 2.a) ± (q / 2.a) . i
          - p = -b / 2.a
          - Q = q / 2.a
          - real = -b/2.a 
            - In real numbers, you cannot take the square root of a negative number.
          - imaginary = q/2.a
            - An imaginary number is a number whose square is negative.
            - √-D / 2.a 
          - complex number=real+imaginary⋅i
          
  - `Leap year`: 
    - *if the year is divisible by 4 and not divisible by 100 its a leap year*

    - *If a number is divisible by 100, it is automatically divisible by 4 and if its divisible by 400, then it is a leap year*

    - *If a year is not divisible by 100, it cannot be divisible by 400.*
            
  - In `Java`, you cannot return two values separated by a comma. A `Java` method can only return one single thing.
  - > *for a `Pearson number`: separate the digits, find the factorial of each digit, sum them, remove the last digit, and then compare.* 
  - > *For an `Armstrong number`: separate the digits, raise each digit to the power of the total number of digits, sum them, remove the last digit, and then compare.*

- *In a single `.java` file, you can have only ONE `public class`, and the `file name` must exactly match that `public class's name`.*

- `In Java`, creating a `class` inside `another class` is `allowed`
- `In Java`, you can apply `public`, `protected`, `private`, or `default (package-private)` to an `inner class`.

- `Java` does not allow you to define a `method` inside `another method`.

- `In Java`, you must `declare` the `array` once (`outside the loop`), and then just `assign` value`s to the specific index inside the `loop`.

- *Cannot pass values directly inside curly braces {} to create an object in Java.*

- *Java passes primitive values by value (it makes a copy), not by reference.*

- `'/'` gives you the quotient and `'%'` gives you the remainder

- `Static` methods belong to the Class. 
- `Non-static` methods belong to the Object

# ***[Java program to calculate area of Triangle | Learn Coding](https://youtu.be/z9SVjqQ6PFY?si=YXOtOpJ7RhosMZFi)***

[![Java program to calculate area of Triangle | Learn Coding](https://img.youtube.com/vi/z9SVjqQ6PFY/0.jpg)](https://youtu.be/z9SVjqQ6PFY?si=YXOtOpJ7RhosMZFi)

# **[***Java program to check input year is leap year or not | Learn Coding***](https://youtu.be/KzXze9iL9hc?si=IHza_9dZDQvRd1x6)**

[![Java program to check input year is leap year or not | Learn Coding](https://img.youtube.com/vi/KzXze9iL9hc/0.jpg)](https://youtu.be/KzXze9iL9hc?si=IHza_9dZDQvRd1x6)