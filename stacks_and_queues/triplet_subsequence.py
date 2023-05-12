def increasing_triplet(nums):

    ## this solution is just for 3 indices in a row which is what i thought the question was asking,
    # but apparently it's three in the whole array
    # i = 0
    # stack = []
    # while i < len(nums):
    #     if len(stack) == 0:
    #         stack.append(nums[i])
    #     elif len(stack) > 0 and nums[i] > nums[i - 1]:
    #         stack.append(nums[i])
    #         if len(stack) == 3: return True
    #     elif nums[i] < nums[i - 1]:
    #         stack.clear()
    #         stack.append(nums[i])
    #     i += 1
    # return False

    first, second = float('inf'), float('inf')

    for third in nums:
        # if second is less than third (current pointer) return true
        if second < third: return True
        # if pointer is less than first, reset first to current
        if third <= first: first = third
        # otherwise, set second to current. (first > current and second greater than current)
        else: second = third
    return False





print(increasing_triplet([1,2,3,4,5]))
print(increasing_triplet([2,1,5,0,4,6]))
print(increasing_triplet([5,4,3,2,1]))
print(increasing_triplet([20,100,10,12,5,13]))