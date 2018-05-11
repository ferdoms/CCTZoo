/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.Mammal;
import ultility.Date;

/**
 *
 * @author Joao Pedro Haddad Oliveira
 */
public class Giraffe extends Animal implements Mammal{

    public Giraffe(Date dateOfBirth, Date dateOfArrival, String gender) {
        super(dateOfBirth, dateOfArrival, gender);
    }

    
    
    
}
