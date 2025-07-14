class Solution(object):
    def isHappy(self, n):
        def next_number(num):
            total = 0
            while num:
                num, digit = divmod(num, 10)
                total += digit * digit
            return total

        slow, fast = n, next_number(n)
        while fast != 1 and slow != fast:
            slow = next_number(slow)
            fast = next_number(next_number(fast))
        return fast == 1
