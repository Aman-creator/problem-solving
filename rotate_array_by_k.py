class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nums[0:len(nums)-k].reverse()
        """
        arr1.reverse()
        arr2  = nums[len(nums)-k:]
        arr2.reverse()
        arr3  = arr1+arr2
        arr3.reverse()
        return arr3"""
        return nums
        
        
        
obj = Solution()
print(obj.rotate([1,2,3,4,5,6,7],3))