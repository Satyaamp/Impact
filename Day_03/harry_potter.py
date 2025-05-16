n = int(input("Enter 4 digit number: "))

last = n % 10


# while n>=10:
#     n = n//10

first = n // 1000
print(last)
print(first)
print(last + first)