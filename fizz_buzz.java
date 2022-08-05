public class fizz_buzz {
    public static void main(String[] args) {
        String divBy3 = "FIZZ";
        String divBy5 = "BUZZ";

        for(int i=1;i<20;i++){
            String ans = "";
            Boolean flag3 = false;
            Boolean flag5 = false;
            if(i%3 ==0){
                ans+= divBy3;
                flag3 = true;
            }
            if(i%5 ==0){
                ans+= divBy5;
                flag5 = true;
            }
            
            if(!flag3 && !flag5){
                ans = ""+i;
            }
            System.out.println(ans);
            if(flag3 && flag5){
                divBy3 = "BUZZ";
                divBy5 = "FIZZ";
            }



        }
    }
    
}
