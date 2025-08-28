public class unique_element1{

    public static int find_element(int arr[]){
        int n = arr.length;
        int fp = 0;
        int sp=1;
        while(sp<n){
            if(arr[fp] != arr[sp]){
                return arr[fp];
            }
            else if(sp == n-2){
                return arr[n-1];
            }
            else{
                fp+=2;
                sp+=2;

            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        System.out.println(find_element(arr));
    }
}