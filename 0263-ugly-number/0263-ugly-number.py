class Solution(object):
    def isUgly(self, n):
        if n <= 0:
            return False
        for f in [2, 3, 5]:
            while n % f == 0:
                n //= f
        return n == 1
