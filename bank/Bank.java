package bank;
class Accout{
    public String name;
    protected String email;
    private String password;
    //getters and setters
    public String getPassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password=pass;
    }

}
public class Bank{
    public static void main(String[] args) {
        Accout accout1=new Accout();
        accout1.name="apna college";
        accout1.email="abc23@gmail.com";
        accout1.setpassword("abcd");
        System.out.println(accout1.getPassword());

    }
    
}