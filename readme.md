# IMPACT Java (Day 01 – Day 05)

## Day 01 – Java Introduction

1. **About Java**  
   - Object-oriented, class-based, platform-independent  
   - WORA – *Write Once, Run Anywhere*

2. **History**  
   - Developed by James Gosling at Sun Microsystems in 1995  
   - Initially named Oak, later renamed Java

3. **Features**  
   - Simple, Secure, Platform Independent, Robust, Portable, High Performance

4. **Applications**  
   - Web apps, Enterprise apps, Desktop GUI, Scientific apps

5. **Data Types**  
   - **Primitive:** `int`, `float`, `double`, `char`, `boolean`, `byte`, `short`, `long`  
   - **Non-Primitive:** `String`, `Arrays`

6. **Operators**
   - **Arithmetic:** `+`, `-`, `*`, `/`, `%`  
   - **Relational:** `==`, `!=`, `>`, `<`, `>=`, `<=`  
   - **Logical:** `&&`, `||`, `!`  
   - **Assignment:** `=`, `+=`, `-=`, etc.

---

## Day 02 – Conditional & Looping Statements

### Conditional Statements

- `if`, `if-else`, `if-else-if`, `nested if`

```java
if(age >= 18) {
   System.out.println("Eligible to vote");
} else {
   System.out.println("Not eligible");
}
```

### Looping Statements

**For Loop:**
```java
for(int i = 1; i <= 5; i++) {
   System.out.println(i);
}
```

**While Loop:**
```java
int i = 1;
while(i <= 5) {
   System.out.println(i);
   i++;
}
```

**Do-While Loop:**
```java
int i = 1;
do {
   System.out.println(i);
   i++;
} while(i <= 5);
```

---

## Day 03 – Digit Manipulation

### What is Digit Manipulation?

- Extract and process digits using `%`, `/`, and loops.

### Logic Snippets

**Extract Digit:**
```java
int digit = num % 10;
num = num / 10;
```

**Reverse Number:**
```java
int rev = 0;
while(num > 0) {
   int digit = num % 10;
   rev = rev * 10 + digit;
   num /= 10;
}
```

**Sum of Digits:**
```java
int sum = 0;
while(num > 0) {
   sum += num % 10;
   num /= 10;
}
```

**Factorial of Digit:**
```java
int fact = 1;
for(int i = 1; i <= digit; i++) {
    fact *= i;
}
```

### Types of Numbers:

- **Special Number** – Sum and product of digits equals number  
- **Single Digit Sum** – Keep summing digits until one digit remains  
- **Adam Number** – `num² == reverse(reverse(num)²)`  
- **Armstrong Number** – Sum of digits raised to number of digits equals the number  
- **Kaprekar Number** – Split square and sum parts = number  
- **Strong Number** – Sum of factorials of digits equals number

---

## Day 04 – Pattern Printing

**Right Triangle:**
```
*
* *
* * *
```

**Reverse Right Triangle:**
```
* * *
* *
*
```

**Opposite Right Triangle:**
```
      *
    * *
  * * *
```

**Hollow Square:**
```
x x x x
x     x
x     x
x x x x
```

---

## Day 05 – Arrays

1. **What is an Array?**  
   - Collection of similar data types stored at contiguous memory locations

2. **Why Array?**  
   - Manage multiple values using a single variable

3. **Scan Array from User:**
```java
int[] arr = new int[5];
Scanner sc = new Scanner(System.in);
for(int i = 0; i < 5; i++) {
   arr[i] = sc.nextInt();
}
```

4. **Problems to Practice:**
- Sum and Subtract of Array Elements  
- Count Distinct Elements in 1D Array (sorted array)  
- Sort Without Built-in Method  
- Compatible Arrays

---

