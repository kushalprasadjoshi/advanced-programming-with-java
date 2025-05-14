# Lab 01 - Constructs in Java

## Objectives

1. Write a program to print odd number between 1 and 10.
2. Write a program to print following shapes using `*`:
    - Right angled traingle
    - Hollow square

## Implementation

### Program to print odd number between 1 and 10.
```java
package lab01constructs;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("The odd numbers from 0 to 100 are: ");
        for(int i = 0; i < 100; i++)
            System.out.println(i);
    }
}
```

**Output:**
```output
The odd numbers from 0 to 100 are: 
0
1
2
...
97
98
99
```

### Program to program to print right angled traingle.
```java
package lab01constructs;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
```

**Output:**
```output
*  
*  *  
*  *  *  
*  *  *  *  
*  *  *  *  *  
```

### Program to print the hollow square
```java
package lab01constructs;

public class HollowSquare {
    public static void main(String[] args) {
        int length = 5;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || j == 0 || i == length-1 || j == length-1)
                    System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
```

**Output:**
```output
*  *  *  *  *  
*           *  
*           *  
*           *  
*  *  *  *  *  

```

--- 