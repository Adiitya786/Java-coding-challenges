public class Binary_to_decimal {

    public static int binDec(int n ,int ans, int p){
        if(n==0){
           return ans;
        }
         return binDec(n/10, ans+(n%10*(int)Math.pow(2,p)), p+1);
    }

    public static void decBin(int n,int ans,int p){
          if(n ==0){
            System.out.print(ans);
            return;
          }
          decBin(n/2,ans+ (n%2)*(int)Math.pow(10,p),p+1);
         
    }
    public static void main(String[] args) {
        int  n =10001;
        int ans =0, power =0;
        System.out.println(binDec(n,ans,power));
        decBin(17,0,0);
}
}