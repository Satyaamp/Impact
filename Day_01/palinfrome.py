n = int(input("Enter number: "))

original = n
rev = 0

while n> 0:
    rem = n %10
    n //= 10
    rev = rev * 10 + rem
    
if original == rev:
    print(f"{original} is plaindrome")
else:
    print(f"{original} is not palindrome")