def kids_with_candies(candies, extra_candies):
    # this space complexity may not be ideal
    bool_list = []
    for candy_amt in candies:
        if candy_amt + extra_candies >= max(candies):
            bool_list.append(True)
        else:
            bool_list.append(False)
    return bool_list

    # We cant do it this way because it alters the max of the list
    # i = 0
    # while i < len(candies):
    #     if candies[i] + extra_candies >= max(candies):
    #         candies[i] = True
    #     else:
    #         candies[i] = False
    #     i += 1
    # return candies



print(kids_with_candies([2,3,5,1,3], 3))
print(kids_with_candies([4,2,1,1,2], 1))