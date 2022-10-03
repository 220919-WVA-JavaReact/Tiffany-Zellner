package com.revature.models;

public class Users {

    private String first;
    private String last;
    private String username;
    private String password;

    public Users(String first, String last, String username, String password) {
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    public Users(){
    }

    public String getFirst() {return first;}

    public void setFirst(String first) {this.first = first;}

    public String getLast() {return last;}

    public void setLast(String last) {this.last = last;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {
        return "Users{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
