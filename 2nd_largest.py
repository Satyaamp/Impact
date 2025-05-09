a = int(input())
b = int(input())
c = int(input())

if(a > b and a < c) or (a < b and a > c):
    second_largest = a
elif(b > a and b < c) or (b < a and b > c):
    second_largest = b
else:
    second_largest = c
    
print(f"Second largest number among {a}, {b}, {c} is {second_largest} ")