n = int(input("Enter: "))

sum_digits = 0

while n > 0:
    ld = n%10
    sum_digits+=ld
    n //= 10
    
print(sum_digits)
    
    