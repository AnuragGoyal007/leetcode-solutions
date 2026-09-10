class Solution(object):
    def isPalindrome(x):
        x = int(input())
        original = x
        reversed = 0

        while x > 0:
    remainder = x % 10
    reversed = reversed * 10 + remainder
    x = x // 10
if original == reversed:
    print("true")
else:
    print("false")
        
        