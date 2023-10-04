abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you created a animal.");
    }
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Hourse extends Animal{
    Hourse(){
        System.out.println("you created a hourse.");
    }
    public void walk(){
        System.out.println("walks of four legs.");
    }
}
class Chiken extends Animal{
    public void walk(){
        System.out.println("walk on two legs.");
    }
}
class abstraction{
    public static void main(String[] args) {
        Hourse horse=new Hourse();
        // horse.walk();
        // horse.eats();

    }
}