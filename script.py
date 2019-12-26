import re
pattern=re.compile("ab+")
matcher=pattern.findall('abababaabb')
print(matcher)
for mat in pattern.finditer("ababaabaabb"):
    print(mat.group())