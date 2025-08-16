public class Flip_square_submat_vertically{


    public static void subarray(int mat[][],int x, int y, int k){
        for(int i=0;i<(k)/2;i++){
            for(int j=y;j<(k);j++){
                int temp = mat[x+i][y+j];
                 mat[x+i][y+j]= mat[x+k-i-1][y+j];
                 mat[x+k-i-1][y+j] = temp;
            }
        }
    }
    public static void print_array(int mat[][]){
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
       }
    
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        subarray(mat, 1, 0, 3);
        print_array(mat);
    }
}