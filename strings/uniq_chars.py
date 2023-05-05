def is_unique(string):
    if len(string) == 1:
        return True
    char = string[0]
    if char in string[1:]:
        return False
    else:
        is_unique(string[1:])


print(is_unique("xyzskdjfn"))
print(is_unique("xopqrxty"))
