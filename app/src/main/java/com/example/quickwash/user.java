package com.example.quickwash;

public class user {
    private int id;
    private String email;
    private String password;
    private String User_Type;


    public  user(int id, String email, String password, String UserType){
        setId(id);
        setemail(email);
        setPassword(password);
        setUser(UserType);
    }
    public void setId(int newId){
        id = newId;
    }
    public void setemail(String newEmail){
        email = newEmail;
    }
    public void setPassword(String newPass){
        password = newPass;
    }
    public void setUser(String newUser){
        User_Type = newUser;
    }
    public int getId( ) {
        return id;
    }

    public String getEmail( ) {
        return email;
    }
    public String getPassword( ) {
        return password;
    }
    public String getUser_Type(){
        return User_Type;
    }
    public String toString(){
        return ("User Name: "+email+" User Type: "+User_Type );
    }


}