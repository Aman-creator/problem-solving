class Solution:
    def maxAreaOfIsland(self, grid: list[list[int]]) -> int:
        largestarea = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] ==1:
                    #largestarea = grid[i][j]
                    if i!=0:
                        grid[i][j]+= grid[i-1][j]
                        grid[i-1][j] = 0
                        largestarea = max(largestarea,grid[i][j])
                    if j!=0:
                        grid[i][j]+=grid[i][j-1]
                        grid[i][j-1] = 0
                        largestarea = max(largestarea,grid[i][j])
                largestarea = max(largestarea,grid[i][j])
        print(grid)
        return largestarea
       
    
    
obj = Solution()
testcasegrid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
trst2 = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
test3 = [[1]]
test4 = [[1,1],[1,0]]
print(obj.maxAreaOfIsland(test4))