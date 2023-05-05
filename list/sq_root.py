def mySqrt(x):
    """
    :type x: int
    :rtype: int
    """
    # set lo and hi as 0 and input
    lo, hi = 0, x

    while lo <= hi:
        # mid is lo plus input div 2
        mid = (lo + hi) // 2
        # if middle squared is greater than x, set hi to mid minus one
        if mid * mid > x:
            hi = mid - 1
        # if mid squared is less than x, set lo to mid plus one
        elif mid * mid < x:
            lo = mid + 1
        else:
            return mid
    return hi



print(mySqrt(4))
print(mySqrt(8))
print(mySqrt(41))
print(mySqrt(2))
