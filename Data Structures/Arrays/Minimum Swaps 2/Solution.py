#!/bin/python3

import math
import os
import random
import re
import sys

def swap(arr, i1, i2):
    tmp = arr[i1]
    arr[i1] = arr[i2]
    arr[i2] = tmp

# Complete the minimumSwaps function below.
def minimumSwaps(arr):

    sortedArr = arr[:]
    sortedArr.sort()
    swapCounter = 0

    while sortedArr != arr:
        for i, e in enumerate(arr):
            if e != sortedArr[i]:
                swapIndex = e - 1
                swap(arr, i, swapIndex)
                swapCounter += 1

    return swapCounter

n = int(input())

arr = list(map(int, input().rstrip().split()))

res = minimumSwaps(arr)

print(res)
