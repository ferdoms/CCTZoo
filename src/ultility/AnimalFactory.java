
package ultility;

import species.*;
import animal.Animal;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiago silva farias
 * @author fernandoms
 */
public class AnimalFactory {

    public Animal create(String animal, Date dateOfBirth, Date dateOfArrival, String gender){
        switch(animal){
            case "Bat":
                return new Bat(dateOfBirth, dateOfArrival, gender);
                
            case "Bear":
                return new Bear(dateOfBirth, dateOfArrival, gender);

            case "Bee":
                return new Bee(dateOfBirth, dateOfArrival, gender);

            case "Bird":
                return new Bird(dateOfBirth, dateOfArrival, gender);

            case "Butterfly":
                return new Bee(dateOfBirth, dateOfArrival, gender);

            case "Cat":
                return new Cat(dateOfBirth, dateOfArrival, gender);

            case "Crocodile":
                return new Crocodile(dateOfBirth, dateOfArrival, gender);
            
            case "Deer":
                return new Deer(dateOfBirth, dateOfArrival, gender);
            
            case "Dog":
                return new Dog(dateOfBirth, dateOfArrival, gender);
            
            case "Fish":
                return new Fish(dateOfBirth, dateOfArrival, gender);
            
            case "Frog":
                return new Frog(dateOfBirth, dateOfArrival, gender);
            
            case "Giraffe":
                return new Giraffe(dateOfBirth, dateOfArrival, gender);
            
            case "Grasshopper":
                return new Grasshopper(dateOfBirth, dateOfArrival, gender);
            
            case "Hippopotamus":
                return new Hippopotamus(dateOfBirth, dateOfArrival, gender);
                
            case "Horse":
                return new Horse(dateOfBirth, dateOfArrival, gender);
                
            case "Lion":
                return new Lion(dateOfBirth, dateOfArrival, gender);
                
            case "Lizard":
                return new Lizard(dateOfBirth, dateOfArrival, gender);
                
            case "Monkey":
                return new Monkey(dateOfBirth, dateOfArrival, gender);
            
            case "Mosquito":
                return new Mosquito(dateOfBirth, dateOfArrival, gender);
                
            case "Owl":
                return new Owl(dateOfBirth, dateOfArrival, gender);
            
            case "Panda":
                return new Panda(dateOfBirth, dateOfArrival, gender);
                
            case "Parrot":
                return new Parrot(dateOfBirth, dateOfArrival, gender);
            
            case "Penguin":
                return new Penguin(dateOfBirth, dateOfArrival, gender);
                
             case "Rat":
                return new Rat(dateOfBirth, dateOfArrival, gender);
                
            case "Rhinocerus":
                return new Rhinocerus(dateOfBirth, dateOfArrival, gender);
            
            case "SeaLion":
                return new SeaLion(dateOfBirth, dateOfArrival, gender);
                
            case "Seal":
                return new Seal(dateOfBirth, dateOfArrival, gender);
            
            case "Snake":
                return new Snake(dateOfBirth, dateOfArrival, gender);
            
            case "Spider":
                return new Spider(dateOfBirth, dateOfArrival, gender);
            
            case "Tiger":
                return new Tiger(dateOfBirth, dateOfArrival, gender);
            
            case "Toucan":
                return new Toucan(dateOfBirth, dateOfArrival, gender);
                
            case "Turtle":
                return new Turtle(dateOfBirth, dateOfArrival, gender);
            
            case "Whale":
                return new Whale(dateOfBirth, dateOfArrival, gender);
            
            case "Wolf":
                return new Wolf(dateOfBirth, dateOfArrival, gender);
        }
        
        return null;
    }
}
