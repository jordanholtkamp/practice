def increasing_triplet(nums):
    i = 0
    stack = []
    while i < len(nums):
        if len(stack) == 0:
            stack.append(nums[i])
        elif len(stack) > 0 and nums[i] > nums[i - 1]:
            stack.append(nums[i])
            if len(stack) == 3: return True
        elif nums[i] < nums[i - 1]:
            stack.clear()
            stack.append(nums[i])
        i += 1
    return False

print(increasing_triplet([1,2,3,4,5]))
print(increasing_triplet([2,1,5,0,4,6]))
print(increasing_triplet([5,4,3,2,1]))