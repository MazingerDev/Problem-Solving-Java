class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        space = True
        s = s[::-1]
        c =0
        for i in s: 
            if space and i == ' ':
                continue
            space = False
            if i == ' ':
                break 
            c +=1
        return c

