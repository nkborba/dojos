"""
Merge strings intercalating characters until the last char of the minor string
"""

str1 = "NIKO"
str2 = "BBBBBSSS"

def mergeStrings(a, b):

    res = ""

    if len(a) >= len(b):
        maior = len(a)
    else:
        maior = len(b)
    
    for i in range(maior):
        if i < len(a):
            res += str1[i]
        if i < len(b):
            res += str2[i]

    return res

print(mergeStrings(str1, str2))
