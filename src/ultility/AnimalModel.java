/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultility;

import animals.Animal;
import java.util.ArrayList;

/**
 *
 * @author fernandoms
 */

//Class created to store animal data
public class AnimalModel {
    
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    public AnimalModel(ArrayList<Animal> animals){
        this.animals = animals;
    }
    
    // stores the animal data
    public void save(Animal a){
        this.animals.add(a);  
    } 
    /**
     * Search an animal by its name through the animalList. Takes in a String
     * 'name' and return an array of Animal.
     */    
    public Animal[] searchByName(String name){
        ArrayList<Animal> resultList = new ArrayList<Animal>();
        for(Animal animal:animals){
            if(animal.getName().equals(name)){
                resultList.add(animal);
            }
        }
        return resultList.toArray(new Animal[resultList.size()]);   
    }
    public Animal searchByExhibitNumber(String enumber){
        
        for(Animal animal:animals){
            if(animal.getExhibitNumber().equals(enumber)){
                return animal;
            }
        }
        return null;
    }
    public Animal[] searchBySpecie(String specie){
        ArrayList<Animal> resultList = new ArrayList<Animal>();
        for(Animal animal:animals){
            if(animal.getSpecie().equals(specie)){
                resultList.add(animal);
            }
        }
        return resultList.toArray(new Animal[resultList.size()]);  
    }
    public Animal[] searchByType(String type){
        ArrayList<Animal> resultList = new ArrayList<Animal>();
        for(Animal animal:animals){
            if(animal.getType().equals(type)){
                resultList.add(animal);
            }
        }
        return resultList.toArray(new Animal[resultList.size()]);  
    }
    
    public void update(Animal animal){
        animals.set(animals.indexOf(animal), animal);
    }
    public void list(){
        for(Animal animal:animals){
            System.out.println(animal.getName() + " The " + animal.getSpecie() + " - " + animal.getGender() + " - " + animal.getType());
        }
    }
}
