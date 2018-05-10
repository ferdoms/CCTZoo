/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultility;

import animals.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author Fernando Marinho da Silva
 * @author Joao Pedro Haddad
 */
public class DataSetup {
    
    Random rand =  new Random();

    Date epoch = new Date();

    
    public DataSetup(){
        
    }
    public String randomName(String gender){
        
        
        if(gender.equals("male")){
            String[] maleNames = {"Charlie", "Buddy", "Max", "Archie", "Oscar", 
                "Toby", "Ollie", "Bailey", "Frankie", "Jack", "Leo", "Milo", "Jasper", "Shadow", "Simba"};
            int number = rand.nextInt(maleNames.length);
            return maleNames[number];
        }
        String[] femaleNames = {"Bella", "Ruby", "Molly", "Lucy", "Coco", "Rosie", "Daisy", 
            "Lola", "Tilly", "Bonnie", "Luna", "Lily", "Daisy", "Lucy", "Lulu", "Millie"};
        int number = rand.nextInt(femaleNames.length);
        return femaleNames[number];
        
        
    }
    
    public String randomSpecie(){
        


        String[] species = {"Bat", "Bear", "Bee", "Bird", "Butterfly", 
            "Cat", "Crocodile", "Deer", "Dog", "Fish", "Frog", "Giraffe",
            "Grasshopper", "Hippopotamus", "Horse", "Lion", "Lizard", "Monkey",
            "Mosquito", "Owl", "Panda", "Parrot", "Penguin", "Rat", "Rhinocerus",
            "SeaLion", "Seal", "Snake", "Spider", "Tiger", "Toucan", "Turtle", "Whale",
            "Wolf"};
        int number = rand.nextInt(species.length);
        return species[number];
    }
    
    public String randomGender(){
        if(rand.nextInt(2) == 1){
            return "male";
        }
        return "female";
    }
    
    public ArrayList<Animal> generateAnimals(int quantity){
        
        ArrayList<Animal> animalsList;
        animalsList = new ArrayList<Animal>();
        Animal animal;
        for(int i=0; i<quantity;i++){
            animal = new AnimalFactory().create(randomSpecie(), new Date().toString(),new Date().toString(), randomGender());
            animal.setName(randomName(animal.getGender()));
            animalsList.add(animal);
        }
        
        return animalsList;
    }
            
}