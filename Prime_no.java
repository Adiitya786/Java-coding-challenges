public class Prime_no{

    public static boolean checkprime(int n,int i){
        if(i ==n/2){
            return true;
        }
        if(n%i == 0){
            return false;
        }
       
        return  checkprime(n,i+1);
        }
    
    public static void main(String[] args) {
        System.out.println(checkprime(67,2));
    }
}