n = int(input("Enter no of coins: "))
x = int(input("Enter ben share: "))
y = int(input("Enter black share: "))


benshare = n * ( x/100)

rem = n - benshare
blackbeard = rem * (y/100)

next_rem = rem - blackbeard

others = next_rem/3

print(benshare)
print(blackbeard)
print(next_rem)
print(others)
