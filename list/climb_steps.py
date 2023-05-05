def climb(n):
    dp = []
    dp.append(1) # dp = [1]
    dp.append(2) # dp = [1, 2] dp[0] => 1, dp[1] => 2
    x = list(range(2, n+1)) # x = [2,3,4]
    for i in x:
        dp.append(dp[i-1] + dp[i-2])


    return dp[n-1]


print(climb(3))
print(climb(4))
print(climb(10))
