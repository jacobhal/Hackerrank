import re
import math

# Complete the repeatedString function below.
def repeatedString(s, n):
    sSize = len(s)
    aCount = s.count('a')
    # Calculate repititions of string needed
    repetitionsNeeded = math.ceil(n/sSize)
    # Calculate the rest and remove the count of 'a' from that result
    rest = (sSize * repetitionsNeeded) % n
    restString = ""
    if rest > 0:
        restString = s[-rest:]
    return aCount * repetitionsNeeded - restString.count('a')

s = input()
n = int(input())

result = repeatedString(s, n)

print(result)
