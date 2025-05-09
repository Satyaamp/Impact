r = int(input("Enter no of rows: "))
c = int(input("Enter no of columns: "))
seat = int(input("Enter the seat number: "))


# if (seat <= c) or (seat%c == 0) or (seat%c == 1):
#     print("CSE")
# else:
#     print("ECE")


row = (seat -1 )// c +1
col = (seat -1)% c + 1

if row == 1 or col == 1 or col == c:
    print("CSE")
else:
    print("ECE")