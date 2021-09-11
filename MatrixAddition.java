// Matrix Adiition using java 
import java.util.Scanner;
public class MatrixAddition{
    public static void main(String[] args){
        
        int rows=2;
        int columns = 3;
        int i,j;
         Scanner sc = new Scanner(System.in);
         
         //Taking input of matrix 1
         int [][] mat1 = new int [rows][columns];
         System.out.println("Enter the elements in matrix 1: ");
         for( i=0;i<rows;i++){
             for( j=0;j<columns;j++){
                 mat1[i][j]= sc.nextInt();
             }
         }
         
         System.out.println("The Elements of Matrix 1 is: ");
         for(i=0;i<rows;i++){
             for(j=0;j<columns;j++){
                 System.out.println(mat1[i][j] +" ");
             }
         }
     
             //Taking input of matrix 2
         int [][] mat2 = new int [rows][columns];
         System.out.println("Enter the elements in matrix 2: ");
         for( i=0;i<rows;i++){
             for( j=0;j<columns;j++){
                 mat2[i][j]= sc.nextInt();
             }
         }
         
        System.out.println("The Elements of Matrix 2 is: ");
         for(i=0;i<rows;i++){
             for(j=0;j<columns;j++){
                 System.out.println(mat2[i][j] +" ");
             }
         }
         
         
        int [][] sum = new int [rows][columns];
        for( i=0; i<rows ; i++){
            for( j=0; j<columns; j++){
                sum[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
        
        System.out.println("Sum of the Matrices is: ");
        for(int [] row: sum){
            for(int column: row){
                 System.out.print(column + " ");
            }
             System.out.println( );
        }
    }
}S