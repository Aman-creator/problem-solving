arr = [-1,-2,-2,-3,-5,-7]
max= arr[0]
curr=arr[0]
for i in range(1,len(arr),1):
    if(curr+arr[i]>curr):
        curr=curr+arr[i]
        max=curr
    else: 
        curr=0
        #max=curr
print(max)