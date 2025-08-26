public class Diagonal_traverse{

    public static void diagonal_print(int mat[][]){
        int m = mat.length;
        int n= mat[0].length;
        int row = 0;
        int col =0,i=0;
        int arr[] = new int[m*n];
        boolean up = true;
        while(row<m && col<n){
            if(up){
                // while  going up
                while(row>0 && col<n-1){
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                 arr[i++] = mat[row][col];
              if(col== n-1){
                row++;
              }
              else{
                col++;
              }
            }

            else{
                // while going down 
                while(col>0 && row<m-1){
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }    
                 arr[i++] = mat[row][col];
                if(row == m-1){
                    col++;
                }
                else{
                    row++;
                }
              }
              up = !up;
            }
            for(int j=0;j<arr.length;j++){
                System.err.print(arr[j]+" ");
            }
        return;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
       diagonal_print(mat);
    }
}