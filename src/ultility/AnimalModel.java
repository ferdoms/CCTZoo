/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultility;

import animals.Animal;
import java.util.ArrayList;

/**
 * Purpose:  this class stores animals data and performs searches through it during 
 * the system life cycle.
 * @author fernandoms
 */
public class AnimalModel {
    
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    public AnimalModel(ArrayList<Animal> animals){
        this.animals = animals;
    }
    
    /**
     * Purpose: stores an animal object.
     * @param Takes in an animal object.
     */  
    public void save(Animal a){
        this.animals.add(a);  
    } 
    
    /**
     * Search an animal by its name through the arrayList animals.
     * @param name takes in a String which is the name to be searched
     * @return an array of Animal object which has a matching name
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
    
    /**
     * Search an animal by its Exhibition Number arrayList animals.
     * @param enumber takes in a String that represents an Exhibition Number
     * @return an Animal object.
     */  
    public Animal searchByExhibitNumber(String enumber){
        
        for(Animal animal:animals){
            if(animal.getExhibitNumber().equals(enumber)){
                return animal;
            }
        }
        return null;
    }
    
    /**
     * Search an animal by its specie through the animalList.
     * @param specie takes in a String that represents an Exhibition Number
     * @return an Animal object.
     */ 
    public Animal[] searchBySpecie(String specie){
        ArrayList<Animal> resultList = new ArrayList<>();
        for(Animal animal:animals){
            if(animal.getSpecie().equals(specie)){
                resultList.add(animal);
            }
        }
        return resultList.toArray(new Animal[resultList.size()]);  
    }
    public Animal[] searchByType(String type){
        ArrayList<Animal> resultList = new ArrayList<>();
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
    
    // testing class
    public void list(){
        for(Animal animal:animals){
            System.out.println(animal.getExhibitNumber()+ " - " + animal.getName() 
                    + " The " + animal.getSpecie() + " - " + animal.getGender() 
                    + " - " + animal.getType());
        }
    }
}
