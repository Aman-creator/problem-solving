public  class merge_sort {
    static int le = 0;
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        
        arr = mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(le);
    }
    public static int[] mergeSort(int arr[], int l, int r) {
        if(l==r){
            int[] ba = {arr[l]};
            return ba;
        }
		int mid = (l+r)/2;
        int[] left = mergeSort(arr,l,mid);
        int[] right= mergeSort(arr,mid+1,r);
        int[] meregd_arr = mergeSortedArray(left,right);
        return meregd_arr;
	}
    public static int[] mergeSortedArray(int[] left,int[] right) {
        int i=0,j=0,k=0;
        int[] result = new int[left.length+right.length];
        while(i< left.length && j<right.length ){
            if(left[i]<= right[j]){
                result[k]=left[i];
                i++;
            }else{
                result[k]=right[j];
                le+=left.length-i;
                j++;
            }
            k++;
        }
        if(i<left.length){
            while(i<left.length){
                result[k]=left[i];
                i++;
                k++;
            }
        }
        if(j<right.length){
            while(j<right.length){
                result[k]=right[j];
                j++;
                k++;
            }
        }
        return result;
    }


    
}
