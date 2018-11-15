import math
import os
import random
import re
import sys

# Complete the minimumBribes function below.
def minimumBribes(q):
    swapCounter = 0
    for idx, val in reversed(list(enumerate(q))):
        swapsNeeded = val - (idx+1)
        # If we need to bribe more than 2 people in order to get to this position, there is no solution
        if swapsNeeded > 2:
            return "Too chaotic"
        # Check all values from initial position in queue - 2 to current position and add 1 if they were behind in the initial queue
        for i in range(max(0, val - 2), idx, 1):
            if q[i] > val:
                swapCounter += 1
    return swapCounter


t = int(input())

for t_itr in range(t):
    n = int(input())

    q = list(map(int, input().rstrip().split()))

    print(minimumBribes(q))
