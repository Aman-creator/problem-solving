public class max_trap_warter {
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,1,1,3};
        int[] leftlargest= new int[arr.length];
        int[] rightlargest= new int[arr.length];

        int leftLarge = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<leftLarge){
                leftlargest[i]=leftLarge;
            }else{
                leftlargest[i]=arr[i];
                leftLarge = arr[i];
            }
        }

        int rightLarge = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<rightLarge){
                rightlargest[i]=rightLarge;
            }else{
                rightlargest[i]=arr[i];
                rightLarge = arr[i];
            }
        }

        int ans =0;
        for(int i=0;i<arr.length;i++){
            int minoflr = Math.min(leftlargest[i],rightlargest[i]);
            int water = minoflr - arr[i];
            ans+=water;
        }

        System.out.println(ans);
    }
}
