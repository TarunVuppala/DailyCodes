# https://leetcode.com/problems/make-the-string-great/description/?envType=daily-question&envId=2024-04-05
def makeGood(self, s: str) -> str:
        stack=[]
        for ch in s:
            if stack and abs(ord(ch)-ord(stack[-1]))==32:
                stack.pop()
            else:
                stack.append(ch)
        return ''.join(stack)


str=input()
print(makeGood(str))