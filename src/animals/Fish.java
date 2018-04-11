/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import interfaces.Aquatic;

/**
 *
 * @author joao-
 */
public class Fish extends Animal implements Aquatic{

    public Fish(String dateOfBirth, String dateOfArrival, String gender, int OffSpring, String medication, boolean vaccine, boolean exhibit, int number) {
        super(dateOfBirth, dateOfArrival, gender, OffSpring, medication, vaccine, exhibit, number);
    }
    
    
    
}
