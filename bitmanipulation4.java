import java.util.Scanner;

class bitmanipulation4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("number is power of 2.");

        }
        else{
            System.out.println("number is not power of 2.");
        }
    }

}