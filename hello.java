import java.util.Arrays;
import java.util.Collections;

public class hello {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};//{10, -2, 6, 3, 1, 20, 100, 80};
        Collections.reverse(Arrays.asList(arr));
        //Collections.reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0  && i<arr.length-1){
                if(arr[i]<arr[i+1]){
                    arr = swap(arr,i,i+1);
                }
            }/*else{
                if( i>0 && i<arr.length-1 && arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    arr = swap(arr,i,i+1);
                }
            }*/
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static int[] swap(int[] arr, int fidx,int sidx){
        int temp = arr[fidx];
        arr[fidx]=arr[sidx];
        arr[sidx]= temp;
        return arr;
    }
}
