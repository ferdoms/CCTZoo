/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.Avian;

/**
 *
 * @author joao-
 */
public class Owl extends Animal implements Avian{

    public Owl(String dateOfBirth, String dateOfArrival, String gender, String medication, boolean vaccine) {
        super(dateOfBirth, dateOfArrival, gender, medication, vaccine);
    }

    

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
