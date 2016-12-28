/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_classes;

/**
 *
 * @author bilalsay
 */
public class Admin {
    private int adminId;
    private String adminName;
    private String adminEmail;
    private int adminDegree;
    
    public Admin(int id, String name, String email, int degree) {
        this.adminId = id;
        this.adminName = name;
        this.adminEmail = email;
        this.adminDegree = degree;
    }
    
    public void setId(int id) { this.adminId = id;}
    public int getId() { return this.adminId;}
    public void setName(String name) { this.adminName = name;}
    public String getName() { return this.adminName;}
    public void setEmail(String email) { this.adminEmail = email;}
    public String getEmail() { return this.adminEmail;}
    public void setDegree(int degree) { this.adminDegree = degree;}
    public int getDegree() { return this.adminDegree;}
}
