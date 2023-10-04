import java.util.Scanner;
import java.util.*;

class arrays6{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row numbers you want");
        int row=sc.nextInt();
        
        System.out.println("Enter col numbers you want");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
       
        System.out.println("Enter matrix numbers");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("output matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}