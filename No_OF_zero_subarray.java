public class No_OF_zero_subarray{
    public static void main(String[] args) {
        int arr[]= {0,0,0,4,0,0};
        long cnt =0;
        int streak=0;
        for(int num:arr){
             if(num==0){
             streak++;
             cnt+=streak;
             }
           else{
            streak=0;
            }
        } 
        System.out.println(cnt);
    }
}