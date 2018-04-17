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
 * @author fernandoms
 */
public class DataSetup {
    
    

    Random rand =  new Random();
    Epoch epoch = new Epoch();
    
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
    
    public String randomGender(){
        if(rand.nextInt(2) == 1){
            return "male";
        }
        
        return "female";
    }
    
    public ArrayList<Animal> generateAnimals(int Quantity){
        
        ArrayList<Animal> animalsList;
        animalsList = new ArrayList<Animal>();
        Animal animal = null;
        for(int i=0; i<Quantity;i++){

            switch(rand.nextInt(3)){
                case 0:
                    animal = createCat();
                    animalsList.add(animal);
                    break;
                                        
                case 1:
                    animal = createBat();
                    animalsList.add(animal);
                    break;
                case 2:
                    
                    animal = createBear();
                    animalsList.add(animal);
                    break;
            }
        
        
        }
        
        
       
        return animalsList;
    }
    
    public Animal createCat(){
        
        Animal cat = new Cat(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        cat.setName(randomName(cat.getGender()));
        return cat;
    }
    public Animal createBat(){
        
        Animal bat = new Bat(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        bat.setName(randomName(bat.getGender()));
        return bat;
    }
    public Animal createBear(){
        
        Animal Bear = new Bear(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Bear.setName(randomName(Bear.getGender()));
        return Bear;
    }
    
    
    
            
}
