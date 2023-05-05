def gcd_of_strings(str1, str2):
    shorter = str1 if len(str1) < len(str2) else str2
    longer = str1 if len(str1) > len(str2) else str2

    gcp = ""
    i = 1
    while i < len(shorter):
        if shorter[:i]:





    if not longer and not shorter:
        return "" if str1 != str2 else str1

    if shorter + shorter == longer:
        return shorter




print(gcd_of_strings("ABAB", "ABABAB"))
print(gcd_of_strings("ABC", "ABCABC"))