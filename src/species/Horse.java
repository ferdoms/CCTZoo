/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package species;

import animal.Animal;
import interfaces.Mammal;
import ultility.Date;

/**
 *
 * @author Joao Pedro Haddad Oliveira
 */
public class Horse extends Animal implements Mammal{

    public Horse(Date dateOfBirth, Date dateOfArrival, String gender) {
        super(dateOfBirth, dateOfArrival, gender);
    }

    
    
    
    
}
