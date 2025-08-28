import java.util.*;

public class unique_element2 {

    public static int find_num(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            else if(i>0 && i<n-1){
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
            else if(i ==n-1){
                if(nums[n-1] != nums[n-2]){
                    return nums[i];
                }
            }

            }
        return -1;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,4,5,3,3,4,5,4,5,2};
        System.out.println(find_num(nums));
    }
}
