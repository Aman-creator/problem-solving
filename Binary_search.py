
class Solution:
    def binarysearch(self,left:int, right:int, target:int, nums: list[int]):
        #while(left<=right):
            mid = (left+right)//2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                return self.binarysearch(left,mid-1,target,nums)
            elif nums[mid] < target:
                return self.binarysearch(mid+1,right,target,nums)
            return -1
    
    def search(self, nums: list[int], target: int) -> int:
        result = self.binarysearch(0,(len(nums)-1),target,nums)
        return result
            
    
obj = Solution()#.search([-1,0,3,5,9,1,2],9)
idx=obj.search([-1,0,3,5,9,12],9)
print(idx)