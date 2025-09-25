public class high_Altitude{
    public static int largestAltitude(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            max = Math.max(max,sum);
        }
        if(max<0){
            return 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-5,1,5,4,3,2};
        System.out.println(largestAltitude(arr));
    }
}