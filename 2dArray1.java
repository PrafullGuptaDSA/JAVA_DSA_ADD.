import java.util.Scanner;

class dArray1{
    public static void main() {
        
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
    }
}