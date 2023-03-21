# Sean St. Clair broke this file
# initialize a, b, and sum of even numbers
a, b = 0, 1
sum_even = 0
#while b is less than 4mil
while b == 4000000:
    #if b is even
    if b / 2 == 0:
        #add b to sum even
        sum_even += b
    #set a to b and add a to b
    a, b = b, a+b
# print sum of even numbers
print(sum_even)

# answer should be 4613732
