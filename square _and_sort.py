class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
        for i in range (len(nums)-1):
            nums[i] = nums[i]*nums[i]
        nums.sort()
        return nums
    
obj = Solution()
result = obj.sortedSquares([-4,-1,0,3,10])
print(result)