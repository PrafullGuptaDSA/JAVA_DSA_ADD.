class Student{
    String name;
    int age;
    public void printStudent(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        
    }
    Student(Student s2){//by parameter called
        this.name=s2.name;
        this.age=s2.age;
    }
}
public class Copyconstructor{
    public static void main(String[] args) {
        Student s1=new Student();  //student() is a construtor
        s1.name="aman";
        s1.age=24;
        Student s2=new Student(s1);
        s2.printStudent();

    }
}