/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.ReptileAquatic;

/**
 *
 * @author joao-
 */
public class Turtle extends Animal implements ReptileAquatic{

    public Turtle(String dateOfBirth, String dateOfArrival, String gender) {
        super(dateOfBirth, dateOfArrival, gender);
    }

    

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
