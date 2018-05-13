/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import animal.Animal;
import java.util.ArrayList;

/**
 * Purpose:  this class stores animals data and performs searches through it during 
 * the system life cycle.
 * @author thiago silva farias
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
            if(animal.getName().equalsIgnoreCase(name)){
                resultList.add(animal);
            }
        }
        if(resultList.isEmpty()){return null;}
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
            if(animal.getSpecie().equalsIgnoreCase(specie)){
                resultList.add(animal);
            }
        }
        if(resultList.isEmpty()){ return null;}
        return resultList.toArray(new Animal[resultList.size()]);  
    }
    public Animal[] searchByType(String type){
        ArrayList<Animal> resultList = new ArrayList<>();
        for(Animal animal:animals){
            if(animal.getType().equalsIgnoreCase(type)){
                resultList.add(animal);
            }
        }
        if(resultList.isEmpty()){ return null;}
        return resultList.toArray(new Animal[resultList.size()]);  
    }
    
    public void update(Animal animal){
        animals.set(animals.indexOf(animal), animal);
    }
    public Animal[] all(){
        return animals.toArray(new Animal[animals.size()]);
    }

}
