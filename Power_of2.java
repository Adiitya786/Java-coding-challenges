public class Power_of2 {
    public static void main(String[] args) {
        int n =64;
         double x = Math.log10(n)/Math.log10(2);
        if(x==(int)x){
            System.out.println(n+" is a power of 2.");
           
        }
       else{
        System.out.println(n+" is not a power of 2.");
       }
    }
}
