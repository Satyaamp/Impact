import math
print("Enter 3 number separated by enter: ")
a = int(input())
b = int(input())
c = int(input())   

gcd = math.gcd(math.gcd(a,b),c)

print(f"GCD of {a}, {b}, {c} = {gcd}")