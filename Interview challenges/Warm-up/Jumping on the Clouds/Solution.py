import math
import sys

# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    jumpCounter = 0
    consecutiveSafeClouds = 0
    for idx, cloud in enumerate(c):
        # If we reach a dangerous cloud, calculate how many jumps we have to do before it and add 1 to get past it
        if cloud == 1:
            jumpCounter += int(consecutiveSafeClouds / 2) + 1
            consecutiveSafeClouds = 0
        # If we are at the end, calculate remaining jumps
        elif idx == len(c) -1:
            jumpCounter += int((consecutiveSafeClouds + 1) / 2)
        # If we are at a safe cloud, just increment number if safe clouds we have encountered in a row
        else:
            consecutiveSafeClouds += 1
    return jumpCounter

# 0 0 1 --> 1, 0 0 0 1 --> 1, 0 0 0 0 1 --> 2, 0 0 0 0 0 1 --> 2

if __name__ == '__main__':

    n = int(input())

    # Split string input and strip whitespace characters from the end, then apply int conversion and put them into a list.
    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)

    print(result)
