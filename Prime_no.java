public class Prime_no{

    public static void checkprime(int fst,int last,int i,int trav){
        if(trav ==last){
            return;
        }
        if(i >(int)Math.sqrt(trav)){
            System.out.print(trav+" ");
            checkprime(fst,last,2,trav+1);
            return;
           
        }
        if(trav==2){
            System.out.print(trav+" ");
             checkprime(fst,last,2,trav+1);
            return;
        }
        if(trav%i == 0){ 
           checkprime(fst,last,2,trav+1);
            
           return;
        }
       
         checkprime(fst,last,i+1,trav);
        }
    
    public static void main(String[]  args) {
       checkprime(1,50,2,2);
    }
}