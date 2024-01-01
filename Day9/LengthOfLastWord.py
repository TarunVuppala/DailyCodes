class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        w=s.split(" ")
        l=len(w)
        for i in range(l-1,-1,-1):
            if(len(w[i])>0):
                return len(w[i])
        
s=input()
sol=Solution()
print(sol.lengthOfLastWord(s))