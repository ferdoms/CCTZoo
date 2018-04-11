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
public class Monkey extends Animal implements Mamal{

    public Monkey(String dateOfBirth, String dateOfArrival, String gender, int OffSpring, String medication, boolean vaccine, boolean exhibit, int number) {
        super(dateOfBirth, dateOfArrival, gender, OffSpring, medication, vaccine, exhibit, number);
    }
    
    
    
}
