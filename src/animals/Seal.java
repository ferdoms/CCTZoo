/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.MammalAquatic;

/**
 *
 * @author joao-
 */
public class Seal extends Animal implements MammalAquatic{

    public Seal(String dateOfBirth, String dateOfArrival, String gender) {
        super(dateOfBirth, dateOfArrival, gender);
    }

    

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
