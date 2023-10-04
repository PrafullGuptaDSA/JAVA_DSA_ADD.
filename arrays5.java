import java.util.Scanner;

class arrays5{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAssending=true;
        for(int i=0;i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAssending=false;
            }
            
        }
        if(isAssending){
        
                System.out.println("assending order");
        }
        else{
            System.out.println("not in assending order");
        }
    }
}