public class No_integer {
    public static void main(String[] args) {
        int n =110;
        
        for(int i=1;i<=n;i++){
            int j =n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
                System.out.println("Two no-zero integer: "+"("+i+","+j+")");
                break;
            }
        }
    }
}
