/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg5;

/**
 *
 * @author Aulas Heredia
 */
public class Usuario {
    public String User;
    private String password;
    public boolean Active = true;

    public String getPassword() {
        System.out.println(password.length());
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
