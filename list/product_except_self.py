def product_except_self(nums):
    # # loop through nums, find the index
    res = []
    i = 0
    multiplier = 1
    while i < len(nums):
        if i == 0:
            for num in nums[1:]:
                multiplier = multiplier * num
            res.append(multiplier)
            multiplier = 1
        elif i == len(nums) - 1:
            for num in nums[:i]:
                multiplier = multiplier * num
            res.append(multiplier)
        else:
            for num in nums[:i] + nums[i+1:]:
                multiplier = multiplier * num
            res.append(multiplier)
            multiplier = 1
        i += 1
    return res

# This solution works but how do we do O(n) time complexity


    length = len(nums)
    # init solution array with ones, same size as input
    sol = [1] * length
    pre = 1
    post = 1
    for i in range(length):
        # solution for current index is itself * pre
        sol[i] *= pre
        # set pre to itself * nums at current index
        pre = pre * nums[i]
        # set solution at position (sol[length - 0 - 1] ~~ sol[3] = sol[3] * post
        sol[length - i - 1] *= post
        # set post to post times opp position of nums
        post *= nums[length - i - 1]
    return sol


print(product_except_self([1,2,3,4])) # should equal [24, 12, 8, 6]