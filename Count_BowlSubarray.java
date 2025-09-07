public class Count_BowlSubarray {
     public static void main(String args[]) {
        int nums[] = {2,5,3,1,4};
           int n = nums.length;
           int  cnt = 0;
       
              int fp =0,sp = fp+2;
        while(fp<n-1){
             int max = Integer.MIN_VALUE;
            if(sp ==n){
                fp+=1;
                sp = fp+2;
            }
            else if((sp-fp+1)>=3){
                int min = Math.min(nums[fp],nums[sp]);
                for(int i=fp+1;i<sp;i++){
                    max = Math.max(max,nums[i]);
                }
                if(min>max){
                    cnt++;
                }
                else {sp++;}
            }
            else{
                sp++;
            }
        }
       System.out.println(cnt);
    }
}
