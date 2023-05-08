def gcd_of_strings(str1, str2):

    # if substring + substring is in the longer, add it to our string builder


    shorter = str1 if len(str1) < len(str2) else str2
    longer = str1 if len(str1) > len(str2) else str2

    gcp = ""

    i = 1
    while i < len(shorter) + 1:
        if shorter[:i] + shorter[:i] in longer:
            gcp = shorter[:i]
        i += 1

    return gcp

# print(gcd_of_strings("ABAB", "ABABAB"))
print(gcd_of_strings("ABC", "ABCABC"))
print(gcd_of_strings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"))