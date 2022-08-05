class Solution:
    def floodFill(self, image: list[list[int]], sr: int, sc: int, newColor: int) -> list[list[int]]:
        image = self.helperfun(image,sr,sc,newColor,image[sr][sc])
        return image
        #base cases
        #if comes to end  of row or column or 
        
        
    def helperfun(self, image: list[list[int]], sr: int, sc: int, newColor: int, originalno: int):
        
        if sr < 0 or sc < 0:
            return image
        if sr >= len(image) or sc >= len(image[sr]):
            return image
        if image[sr][sc] != originalno:
            return image
        #make change to youself first
        #orgcolor = image[sr][sc]
        
        if image[sr][sc] == newColor:
            return image
        else:
            image[sr][sc] = newColor 
        
        #make changes to all four direction if same number
        #check in clockwise direction from up
        # upper
        self.helperfun(image,sr-1,sc,newColor,originalno)
        #right
        self.helperfun(image,sr,sc+1,newColor,originalno)
        #down
        self.helperfun(image,sr+1,sc,newColor,originalno)
        #left
        self.helperfun(image,sr,sc-1,newColor,originalno)
            
        #image[sr][sc] = newColor
        
        return image

obj = Solution()
print(obj.floodFill([[0,0,0],[0,1,1]],1,1,1))