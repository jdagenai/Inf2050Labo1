/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.*;

/**
 *
 * @author Dell
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom = args[0];
        String nom = args[1];
        System.out.println("Bonjour " + prenom + " " + nom + "!");
        
        Person jonh = new Person("Jonh", "Doe", 35);
        System.out.println("Prenom : " + jonh.getFirstName());
    }
    
}
