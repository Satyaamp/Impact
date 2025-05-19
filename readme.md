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

Here is a complete **GitHub README.md** file for **Bit Manipulation in Java**, covering:

* Bitwise Operators
* Check/Set/Clear/Toggle ith bit
* Count set bits (with and without modulus)
* With one example for each

---

### ✅ `README.md` – Bit Manipulation in Java

````markdown
# 🧠 Bit Manipulation in Java

Bit manipulation is a powerful technique in competitive programming and system-level development. It allows you to perform operations directly on the bits of integers, making computations faster and memory efficient.

---

## ⚙️ Bitwise Operators

| Operator | Description           | Example (a = 5, b = 3) | Result (in binary) |
|----------|------------------------|------------------------|---------------------|
| `&`      | AND                    | `a & b` = `5 & 3`      | `0101 & 0011 = 0001` (1) |
| `|`      | OR                     | `a | b` = `5 | 3`      | `0101 | 0011 = 0111` (7) |
| `^`      | XOR                    | `a ^ b` = `5 ^ 3`      | `0101 ^ 0011 = 0110` (6) |
| `~`      | NOT                    | `~a` = `~5`            | `~0101 = 1010` (-6 in 2's comp) |
| `<<`     | Left Shift             | `a << 1` = `5 << 1`    | `1010` (10) |
| `>>`     | Right Shift            | `a >> 1` = `5 >> 1`    | `0010` (2) |

---

## 1️⃣ Check if the ith Bit is Set

### 📌 Code
```java
int n = 5;  // 0101
int i = 2;

if ((n & (1 << i)) != 0) {
    System.out.println("Set bit");
} else {
    System.out.println("Unset bit");
}
````

### 📎 Example

`n = 5 (0101)` → checking `2nd` bit → result: ✅ Set Bit

---

## 2️⃣ Set the ith Bit (Make it 1)

### 📌 Code

```java
int n = 5;  // 0101
int i = 1;

n = n | (1 << i);
System.out.println(n);
```

### 📎 Example

Set 1st bit of 5 → `0101 | 0010 = 0111` → Output: `7`

---

## 3️⃣ Clear the ith Bit (Make it 0)

### 📌 Code

```java
int n = 7;  // 0111
int i = 2;

n = n & ~(1 << i);
System.out.println(n);
```

### 📎 Example

Clear 2nd bit of 7 → `0111 & ~(0100)` = `0011` → Output: `3`

---

## 4️⃣ Count Number of Set Bits

### 🔹 (a) Using Modulus (for binary-like decimal)

```java
int n = 10111; // decimal representation of binary digits
int count = 0;
while (n > 0) {
    int ld = n % 10;
    if (ld == 1) count++;
    n /= 10;
}
System.out.println(count);
```

**Output:** `4`

---

### 🔹 (b) Using Bitwise Operators

```java
int n = 30; // binary = 11110
int count = 0;

while (n > 0) {
    if ((n & 1) == 1) count++;
    n >>= 1;
}
System.out.println(count);
```

**Output:** `4`

---

### 🔹 (c) Brian Kernighan's Algorithm

```java
int n = 30;
int count = 0;

while (n > 0) {
    n = n & (n - 1);
    count++;
}
System.out.println(count);
```

**Output:** `4`

---

## 5️⃣ Toggle the ith Bit

### 📌 Code

```java
int n = 5; // 0101
int i = 1;

n = n ^ (1 << i);
System.out.println(n);
```

### 📎 Example

Toggle 1st bit of 5 → `0101 ^ 0010 = 0111` → Output: `7`

---

## 🚀 Summary Table

| Operation      | Code Syntax                                           |            |
| -------------- | ----------------------------------------------------- | ---------- |
| Check ith bit  | `(n & (1 << i)) != 0`                                 |            |
| Set ith bit    | \`n = n                                               | (1 << i)\` |
| Clear ith bit  | `n = n & ~(1 << i)`                                   |            |
| Toggle ith bit | `n = n ^ (1 << i)`                                    |            |
| Count set bits | `while(n > 0) { n & 1; n>>=1; }` or `Brian Kernighan` |            |

---

## 📚 License

This repository is licensed under the MIT License.

---

## 🤝 Contributing

Pull requests and feedback are welcome! Feel free to fork and improve.

```

---

Let me know if you'd like:
- A matching Java `.java` file too ✅  
- Or I can push this to a GitHub repo for you if you provide access ✍️
```
