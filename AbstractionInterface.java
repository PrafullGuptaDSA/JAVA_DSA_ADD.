interface Animal{
    int eyes=2;
    public void walk();
}
class Hourse implements Animal{
    Hourse(){
        System.out.println("you created a hourse.");
    }
    public void walk(){
        System.out.println("walks of four legs.");
    }
}
class Chiken implements Animal{
    public void walk(){
        System.out.println("walk on two legs.");
    }
}
class AbstractionInterface{
    public static void main(String[] args) {
        Hourse horse=new Hourse();
        horse.walk();
        // horse.eats();

    }
}