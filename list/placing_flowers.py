def canPlaceFlowers(flowerbed, n) -> bool:
    i = 0
    if len(flowerbed) == 1 and n == 1 and flowerbed[i] == 0:
        return True
    while i < len(flowerbed):
        if flowerbed[i] == 0:
            if i == 0 and flowerbed[i + 1] == 0:
                flowerbed[i] = 1
                n -= 1
            elif i == len(flowerbed) - 1 and flowerbed[i - 1] == 0:
                flowerbed[i] = 1
                n -= 1
            elif flowerbed[i - 1] == 0 and flowerbed[i + 1] == 0:
                flowerbed[i] = 1
                n -= 1
        if n == 0: return True
        i += 1
    return False

# print(canPlaceFlowers([1,0,0,0,1], 1))
# print(canPlaceFlowers([1,0,0,0,1], 2))
print(canPlaceFlowers([0,0,1,0,0], 1))
# print(canPlaceFlowers([0], 1))

