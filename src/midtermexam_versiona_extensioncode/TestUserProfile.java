/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author nroma
 */
public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserProfile roman = new UserProfile("Romek2", "Drama");
        
        System.out.println("Your User Id is: "+roman.getUserID() + "and your favorite genre is: "+roman.getGenre());
        
        
        
    }
    
}
