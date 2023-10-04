import java.util.Scanner;

class bitmanipulation3{
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value 0 or 1 which you want to make");
        int value=sc.nextInt();
        if(value==0){
            int notBitMask=~(bitMask);
            int newNumber=notBitMask & n;
            System.out.println(newNumber);
        }
        else{
            int newNumber2=bitMask | n;
            System.out.println(newNumber2);
        }
    }

}