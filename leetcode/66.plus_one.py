class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        num = int("".join([str(i) for i in digits]))
        num += 1
        return [int(j) for j in str(num)]
        
