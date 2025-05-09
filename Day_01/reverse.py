# n = input("Enter number: ")

# print(n[::-1])

n = int(input("Enter number: "))

rev = 0

while n> 0:
    rem = n %10
    n //= 10
    rev = rev * 10 + rem
    
print(rev)