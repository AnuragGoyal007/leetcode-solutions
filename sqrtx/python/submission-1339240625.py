class Solution(object):
    def mySqrt(self, x):
        if x<2:
            return x
        i = x//2+1
        last = 0
        while True:
            if i*i<=x and (i+1)**2>x:
                return i
            if (i)**2 > x:
                last = i
                i = i // 2
            elif i**2 < x:
                i = (i+last)//2
        