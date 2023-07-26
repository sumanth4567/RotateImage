import java.util.Stack;
import java.util.Scanner;
class RotateImage{
    public void rotate(int[][] matrix){
        int row = matrix.length;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                stk.push(matrix[i][j]);
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = row-1; j >= 0; j--){
                matrix[j][i] = stk.pop();
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        RotateImage r=new RotateImage();
        int row=sc.nextInt();
        int matrix[][]=new int[row][row];
        System.out.println("Enter the matrix values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        r.rotate(matrix);
        System.out.println("The rotated matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
