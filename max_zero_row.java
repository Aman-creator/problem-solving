/*package whatever //do not write package name here */
import java.util.*;
class max_zero_row {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{0,0,1,1},{0,0,0,0},{0,1,1,1}};
        /*for(int[] row : arr){
            Arrays.fill(row,1);
        }*/
        rowWithMaxOne(arr);
        int n= arr.length;
        int m=arr[0].length;
        int maxz=-1;
        int maxz_row =-1;
        int minz=  m;               //(int)1e9
        int minz_row =-1; 
        for(int i=0;i<n;i++){
            int lo=0,hi=m-1,noz=0;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if((arr[i][mid] == 0) && (mid == m-1 || arr[i][mid+1]==1) ){
                    noz =mid+1;
                    break;
                }else if(arr[i][mid]>0){
                    hi=mid-1;
                }else{
                   lo=mid+1; 
                }
            }
            if(noz>maxz){
                maxz = noz;
                maxz_row = i;
            }
            if(noz<minz){
                minz = noz;
                minz_row = i;
            }
        }
        System.out.println("max zero row : "+ maxz_row);
        System.out.println("min zero row : "+ minz_row);
    }
    public static void rowWithMaxOne(int[][] arr){
        int max1 = 0 ,ans =0;
        
        
        for(int i=0;i<arr.length;i++){
            int l=0,r =arr[0].length-1,lmax1 = 0;;
            while(l<=r){
                int mid = (l+r)/2;
                if((arr[i][mid]==1) && (mid==0 || arr[i][mid-1]==0) ){
                    lmax1 = mid;
                    break;
                }
                else if(arr[i][mid]==0){
                    l=mid;
                }else{
                    r= mid;
                }
                
            }
            if(lmax1 < max1){
                ans = i;
                max1 =lmax1;
            }
        }
        System.out.println(ans);
    }
}

