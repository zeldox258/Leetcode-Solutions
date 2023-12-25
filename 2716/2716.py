class Solution(object):
    def minimizedStringLength(self, s):
        unique_chars = set()
        for char in s:
            unique_chars.add(char)
        return len(unique_chars)
        
        """
        :type s: str
        :rtype: int
        """
        