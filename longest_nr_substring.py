class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        arr = []
        max = 0
        for i in range(len(s)):
            if s[i] in arr:
                if max < len(arr):
                    max = len(arr)
                arr.clear()
            arr.append(s[i])
        return max
            
        
        
obj = Solution()
print(obj.lengthOfLongestSubstring("pwwkew"))