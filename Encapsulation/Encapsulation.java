package Encapsulation;

public class Encapsulation {

    public static void main(String[] args) {

       Testing obj = new Testing();

       obj.setId(101);
       obj.setPassword("solo");

       System.out.println(obj.getId() + "\n" +obj.getPassword());
        
    }
    
}

class Testing{

    private int id;
    private String password;
    
//getter and setter method

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    



}
