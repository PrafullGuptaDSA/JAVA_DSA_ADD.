class bitmanipulation5{
    public static void main(String args[]) {
        int n=5;
        int x=n & (n-1);
        int count=1;
        while(x!=0){
            count++;
            x= x & (x-1);
        }
        System.out.println(count);
        }
}

    