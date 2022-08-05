
public class sort_array_012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,1,0,1,1};
        int no0 = 0,no1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                no0++;
            else if(arr[i]==1)
                no1++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<no0)
                arr[i]=0;
            else if(i>=no0 && i<no0+no1)
                arr[i]=1;
            else
                arr[i]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
