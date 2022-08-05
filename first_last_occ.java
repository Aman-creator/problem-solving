public class first_last_occ {


    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = new int[2];
        ans[0] = occurance(nums,target,true);
        ans[1] = occurance(nums,target,false);
        System.out.println("0th :"+ans[0]+"1st :"+ans[1]);
    }
    
    public static int occurance(int[] arr, int tar,boolean first){
        int lo = 0;
        int hi= arr.length-1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == tar){
                if(first){
                    if(mid==0 || arr[mid-1]!=tar){
                        return mid;
                    }else{
                        hi= mid-1;
                    }
                }else{
                    if(mid==arr.length-1 || arr[mid+1]!=tar){
                        return mid;
                    }else{
                        lo= mid+1;
                    }
                }
                
                
            }else if(tar<arr[mid]){
                hi= mid-1;
            }else{
                lo=mid+1;
            }
        }
        
        return -1;
    }
    
}
