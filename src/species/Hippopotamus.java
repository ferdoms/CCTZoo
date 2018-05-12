/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package species;

import animal.Animal;
import interfaces.Mammal;
import interfaces.MammalAquatic;
import ultility.Date;

/**
 *
 * @author Joao Pedro Haddad Oliveira
 */
public class Hippopotamus extends Animal implements MammalAquatic{

    public Hippopotamus(Date dateOfBirth, Date dateOfArrival, String gender) {
        super(dateOfBirth, dateOfArrival, gender);
    }

    

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
