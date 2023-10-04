import java.util.Scanner;

class arrays2{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array. ");
        int size=sc.nextInt();
        int lists[]= new int[size];
        System.out.print("Enter number plz: ");
        for(int i=0;i<size;i++){
            lists[i]=sc.nextInt();
        }
        
            System.out.print("Entered numbers are: ");
        for(int i=0;i<size;i++){
            System.out.print(lists[i]+" ");
        }
        System.out.print("enter a number to be search ");
        int number=sc.nextInt();
        
        for(int i=0;i<size;i++){
            if(number==lists[i]){
                System.out.print("index number of searched number"+i);
            }
        }
    
        
    }
}