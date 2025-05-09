n = int(input("Enter: "))

last_digit = n % 10

while n >=100:
    n //= 10
    second = n
    
sum = last_digit + second
print(sum)