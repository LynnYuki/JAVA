package test;

public class User{
    String name;
    String password;
    
    public User(){}
    
    public void setName(String n){
       this.name=n;
    }
    public void setPassword(String p){
       this.password=p;
    }
     
    public String getName(){
       return this.name;
    }
    
    public String  getPassword(){
       return this.password;
    }      
}