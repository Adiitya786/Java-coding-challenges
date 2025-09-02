public class Spy_number {

    // Spy number is a number whose sum of digits equals to the product of digits...
    public static void main(String[] args) {
        int num =1124;
        int org = num;
        int rem =0,sum =0;
        int remo=0,mul=1;
        while(num>0){
            rem = num%10;
            sum += rem;
            num =num/10;
        }

        while(org >0){
             remo=org%10;
             mul *= remo;
             org = org/10;
        }
         if(sum == mul){
            System.out.println("spy number...");
         }
         else{
            System.out.println("not a spy number...");
         }
    }
    
}
