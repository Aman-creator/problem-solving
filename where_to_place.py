class Solution:
    def searchInsert(self, nums: list[int], target: int) -> int:
        left = 0
        right = len(nums)-1
        if target < nums[left]:
            return 0
        elif target > nums[right]:
            return right+1
        
        while(left<= right):
            mid = (left+right)//2
            
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                if nums[mid+1] > target:
                    return mid+1
                left = mid+1
            else:
                if nums[mid-1] < target:
                    return mid
                right = mid-1
        
obj= Solution()
result = obj.searchInsert([1,3,5,6],2)
print(result)