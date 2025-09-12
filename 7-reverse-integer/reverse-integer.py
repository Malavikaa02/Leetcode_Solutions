class Solution(object):
    def reverse(self, x):
        sign = -1
        sign = -1 if x < 0 else 1
        rev = 0
        x = abs(x)
        while x != 0:
            dig = x % 10
            rev = rev * 10 + dig
            x //= 10
        rev *= sign

        if rev < -2**31 or rev > 2**31 -1:
            return 0
        return rev