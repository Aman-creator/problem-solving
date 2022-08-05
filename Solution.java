public class Solution {
    public static void  main(String args[]){
        int[] arr = {-2,3,-5};
        int[] result = sortArray(arr);
        for(int ele: result){
            System.out.println(ele);
        }
    }
    public static int[] sortArray(int[] nums) {
        nums = mergeSort(nums,0,nums.length-1); 
        return nums;
    }
    
    public static int[] mergeSort(int[] nums,int l,int r){
        if(l==r){ 
            int[] ba = new int[1];
            ba[0]= nums[l];
            return ba;
        }
        int mid = (l+r)/2;
        int[] firstHalf = mergeSort(nums,l,mid);
        int[] secondHalf = mergeSort(nums,mid+1,r);
        int[] ans = mergeTwoSortedArray(firstHalf,secondHalf);
        return ans;
    }
    public static int[] mergeTwoSortedArray(int[] first,int[] second){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[first.length+second.length];
        while(i!=first.length && j!=second.length){
            if(first[i]<=second[j]){
                ans[k]=first[i];
                i++;
            }else{
                ans[k]=second[j];
                j++;
            }
            k++;
        }
        if(i!=first.length){
            while(i!=first.length){
                ans[k]=first[i];
                i++;
                k++;
            }
        }
        if(j!=second.length){
            while(j!=second.length){
                ans[k]=second[j];
                j++;
                k++;
            }
        }
        return ans;
    }
}
