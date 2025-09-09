public class Power_calculation {

    public static double pow(double nums,int x){
        if(x==0){
            return 1;
        }
        if(x<0){
            return 1/pow(nums,-x);
        }
        if(x%2 ==0){
            return pow(nums*nums,x/2);
        }
       else{
            return nums *( (int)pow(nums*nums,(x-1)/2));
        }
    }
    public static void main(String[] args) {
        int num =2;
        int x=10;
        
         System.out.println(pow(num,x));
         System.out.println(pow(5,-2));
    }
}
