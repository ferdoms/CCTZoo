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
public class Toucan extends Animal implements Avian{

    public Toucan(String dateOfBirth, String dateOfArrival, String gender, int OffSpring, String medication, boolean vaccine, boolean exhibit, int number) {
        super(dateOfBirth, dateOfArrival, gender, OffSpring, medication, vaccine, exhibit, number);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
