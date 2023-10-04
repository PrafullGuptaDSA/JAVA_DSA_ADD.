class bitmanipulation2{
    public static void main(String[] args) {
        int number=5;
        int pos=2;
        int bitMask=1<<pos;
        int newBitmaskwithnot=~(bitMask);
        int newNumber=newBitmaskwithnot & number;
        System.out.println(newNumber);
    }

}