def listBeautifier(a):
    res = a[:]
    while res[0] != res[-1]:
        a, *res, c = res
        print(res)
    return res


a = [3, 4, 2, 4, 38, 4, 5, 3, 2]
print(listBeautifier(a))