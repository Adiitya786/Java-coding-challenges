public class recursionpractice {
    public static void printdec(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==0) return;
        printinc(n-1);
        System.out.print(n+" ");
    }

    public static int sumNat(int  n){
        if(n==0) return 0;
        return n+sumNat(n-1);
    }
    public static int fibono(int n){
        if(n==0 || n==1) return n ;
        return fibono(n-1)+fibono(n-2);
    }
    public static void fiboseries(int n,int a,int b){
        if(n==0 ) return;
        System.out.print(a+" ");
        fiboseries(n-1, b,  a+b);

    }
    public static boolean issort(int arr[],int i){
        if(i==arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;
        return issort(arr, i+1);
    }
    public static void main(String args[]){
        printdec(10);
        // printinc(10);
        // System.out.println(sumNat(5));
        // System.out.println(fibono(5));
        // fiboseries(10, 0, 1);
        // int arr[] = {1,2,3,4,8};
        // System.out.println(issort(arr, 0));
    }
}
