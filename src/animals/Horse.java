/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.Mamal;

/**
 *
 * @author joao-
 */
public class Horse extends Animal implements Mamal{

    public Horse(String dateOfBirth, String dateOfArrival, String gender, String medication, boolean vaccine) {
        super(dateOfBirth, dateOfArrival, gender, medication, vaccine);
    }

    
    
    
    
}
