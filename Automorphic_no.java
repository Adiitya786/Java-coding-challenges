public class Automorphic_no {
    //Automorphic number is the number if its square ends with the same digits as the number itself.
    public static void main(String[] args) {
        int nums = 376;
        int count =0,remo=0;
        int rev =0;
        int rem=0,ans=0;
        int org = nums;
        int square = nums*nums;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        while(count>0){
            rem = square%10;
            ans = ans*10 +rem;
            square=square/10;
            count--;
        }
        while(ans>0){
            remo = ans%10;
            rev= rev*10 +remo;
            ans=ans/10;
            
        }
        if(rev == org){
            System.out.println("Automorphic no.");
        }
        else{
            System.out.println("Not Automorphic no.");
        }
    }
}
