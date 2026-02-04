import java.util.*;
public class spiralno{

    public static void spiral(int mat[][]){
        int strow =0,stcol =0;
        int endrow = mat.length-1,endcol = mat[0].length-1;
        while(strow<=endrow && stcol<= endcol){
            //top
             if(stcol ==endcol){ break;}
              for(int i=stcol;i<=endcol;i++){
               
                System.out.print(mat[strow][i]+" ");
              }
            //right
            if(strow == endrow) {break;}
             for(int j=strow+1;j<=endrow;j++){
                 
                System.out.print(mat[j][endcol]+" ");
             }
            //bottom
              for(int i = endcol-1;i>=stcol;i--){
                System.out.print(mat[endrow][i]+" ");
              }
            //left
             for(int j = endrow-1;j>=strow+1;j--){
                System.out.print(mat[j][stcol]+" ");
              }
              strow++;
              stcol++;
              endcol--;
              endrow--;
        }
    }
    public static void print(int mat[][]){
         for(int i =0;i<mat.length;i++){
        for(int j =0;j<mat[0].length;j++){
           System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void diagonal(int mat[][]){
      int n = mat.length;
      int m = mat[0].length;
      for(int i =0;i<n;i++){
        System.out.print(mat[i][i]+ " ");

        if(i!= n-i-1){
          System.out.print(mat[i][n-i-1]+" ");
        }
      }
    }
    public static void findkey(int mat[][]){
      int row = 0,col = mat[0].length-1;
      int key =14,flag=0;
      while (row<mat.length && col>=0) {
        if(key ==mat[row][col]){
          System.out.println(row+" "+col);
          flag=1;
          break;
        }
        if(key>mat[row][col]){
          row++;
        }
        else{
          col--;
        }
      }
      if(flag ==0) System.out.println("Key not found");
    }
public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the no. of rows");
    // int rows = sc.nextInt();
    // System.out.println("enter the no. of columns");
    // int col = sc.nextInt();
    // int mat[][] = new int[rows][col];
    // for(int i =0;i<rows;i++){
    //     for(int j =0;j<col;j++){
    //         mat[i][j]= sc.nextInt()
    //     }
    // }
    int mat[][] = {{1,2,3,4}
                  ,{5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
  //  spiral(mat);
  findkey(mat);
}
}