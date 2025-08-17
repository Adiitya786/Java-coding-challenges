public class Max_num {
    public static void main(String[] args) {
        int num = 9669;
        String str = String.valueOf(num);
        int digits[]= new int[str.length()];
        for(int i=0;i<str.length();i++){
            digits[i] = str.charAt(i) - '0';
        }
        for(int i=0;i<digits.length;i++){
            if(digits[i]== 6){
                digits[i] = 9;
                break;
            }
        }
        int nums = 0;
        for(int i=0;i<digits.length;i++){
            nums =nums *10 +digits[i];
        }
        System.out.println(nums);
    }
}
