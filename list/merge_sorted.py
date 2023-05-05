def merge(nums1, m, nums2, n):

    # while n is not zero
    while n:
        # if m is not zero and end of nums1 is greater than end of nums2
        if m and nums1[m - 1] >= nums2[n - 1]:
            # last nums1 = last non zero of nums1
            nums1[m + n - 1] = nums1[m - 1]
            m -= 1
        else:
            # else last nums = last of n2
            nums1[m + n - 1] = nums2[n - 1]
            n -= 1

    return nums1

if merge([1,2,3,0,0,0], 3, [2,5,6], 3) == [1,2,2,3,5,6]:
    print("NICE")
else:
    print("WRONG: ")
print(merge([1,2,3,0,0,0], 3, [2,5,6], 3))