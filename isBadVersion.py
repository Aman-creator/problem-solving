
class Solution:
    def isBadVersion(self,version:int):
        if version >= 1:
            return True
        else:
            return False
        
        
    def binary_serch_for_bad(self, left:int, right:int, List:list[int]) -> int:
        mid = (left+right)//2
        if self.isBadVersion(List[mid]) and not self.isBadVersion(List[mid-1]):
            return mid
        elif self.isBadVersion(List[mid]) :
            return self.binary_serch_for_bad(left,mid-1,List)
        else: #not self.isBadVersion(List[mid]) :
            return self.binary_serch_for_bad(mid+1,right,List)
        
        return -1     
        
    def firstBadVersion(self, n: int) -> int:
        versions_list = [x for x in range(n+1)]
        return self.binary_serch_for_bad(1, n,versions_list)
        
obj = Solution()
result = obj.firstBadVersion(0)
print(result)