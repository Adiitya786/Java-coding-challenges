public class Happy_sadNum{

    public static void happy_sad(int num){
        
       
         int rem=0,sum=0;
         
        while(num>0){
            rem = num%10;
            sum +=rem*rem;
            num = num/10;
        }
        if(sum == 1){
            System.out.println("Happy no.");
            return;
        }
        else if(sum == 4){
            System.out.println("Sad no.");
            return;
        }
           
            happy_sad(sum);
            
    }
    public static void main(String[] args) {
        int num =20;
        happy_sad(num); 
       
    }
}