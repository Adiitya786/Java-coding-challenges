public class Even_oddSum {

    public static void evenodd(int n, int soe,int soo){
        if(n==0){
            System.out.println("Even sum: "+ soe);
            System.out.println("Odd sum: "+ soo);
            return;
        }
        if(n%2 ==0){
          evenodd(n-1, soe+n, soo);
          }
        if(n%2 !=0){
          evenodd(n-1, soe, soo+n);
          }
    }
    public static void main(String[] args) {
        int n =50;
        evenodd(n,0,0);
    }
    
}
