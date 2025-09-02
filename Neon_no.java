public class Neon_no {

    // Neon number is a number whose sum of the digits of square  is equal to the original number.
    public static void main(String[] args) {
        int rem =0,sum =0;
        int nums = 9;
        int squ = nums*nums;
        while (squ>0) {
            rem = squ%10;
            sum += rem;
            squ = squ/10;
        }

        if(sum == nums){
            System.out.println("Neon no.");
        }
        else{
            System.out.println("not a neon no.");
        }
    }
}
