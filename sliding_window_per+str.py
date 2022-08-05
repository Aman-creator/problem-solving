class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        left = 0
        right = len(s1)-1
        
        while(right<len(s2)):
            winstr=list(s2[left:right+1])
            for letter in s1:
                if letter in winstr:
                    winstr.remove(letter)
                else:
                    left+=1
                    right+=1
                if len(winstr) == 0:
                    return True
            #left+=1
            #right+=1
        return False
    
obj= Solution()
print(obj.checkInclusion("ab","eidboaooo"))