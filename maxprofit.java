public class maxprofit {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        int minsf = arr[0];
        int maxp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< minsf){
                minsf = arr[i];
            }
            int profit = arr[i]-minsf;
            maxp = Math.max(profit,maxp);
        }
        System.out.println(maxp);
    }
}
