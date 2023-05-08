def product_except_self(nums):
    # loop through nums, find the index
    res = []
    i = 0

    while i < len(nums):
        if i != 0:
            res[i] = res * nums[i]



print(product_except_self([1,2,3,4])) # should equal [24, 12, 8, 6]