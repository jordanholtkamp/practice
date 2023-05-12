def contains_duplicate(nums):
    found = {}
    for i in nums:
        if i in found:
            return True
        else:
            found[i] = 1
    return False

print(contains_duplicate([1,2,3,4,5,6,7,1]))