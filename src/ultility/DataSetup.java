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
import keeper.Keeper;

/**
 *
 * @author Fernando Marinho da Silva
 * @author Joao Pedro Haddad Oliveira.
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
            animal = new AnimalFactory().create(randomSpecie(), new Date(), new Date(), randomGender());
            animal.setName(randomName(animal.getGender()));
            animalsList.add(animal);
        }
        
        return animalsList;
    }
            

    public String randomKeeperName(){
        
            String[] firstName = {"Olivia", "Charlotte", 
                "Silas", "Declan", "Oliver", 
                "Noah", "Amelia", "Mia", 
                "Emma", "Ava", "Luna",
                "Aria", "Isabella", "Arabella",
                "Bodhi", "Mason", "Jack", "William",
                "Milo", "Owen", "Jack", "Ben",
                "Brian", "Maurice", "James",
                "John", "Carl", "Steven", "Ana",
                "Mike", "Charles", "Alan", "Jack", 
                "Christy", "Noel", "Glenn", 
                "Mark", "Phil", "Aaron", "Jonnie"};

            String[] lastName = {"Adler", "Anderson", 
                "Bardot", "Becker", "Becket", 
                "Cohen", "Coleman", "Copeland", 
                "Davis", "Delaney", "Devlin",
                "Dixon", "Duncan", "Ellis",
                "Finley", "Gibbs", "Griffin", "Hendrix",
                "Hepburn", "Hutton", "Jennings", "Jones",
                "Kennedy", "Langley", "Lennehan",
                "incoln", "Miller", "Monroe", "Nash",
                "Nixon", "Penn", "Smith", "Stone", 
                "Sullivan", "Sutton", "Thompson", 
                "Walker", "West", "Whiley", "Wilson"};

            int nFirstName = rand.nextInt(firstName.length); 
            int nLastName = rand.nextInt(lastName.length);
            return firstName[nFirstName] + " " + lastName[nLastName];
        
        
    }
    
    public ArrayList<Keeper> generateKeepers(int quantity){
        
        ArrayList<Keeper> keeperList;
        keeperList = new ArrayList<Keeper>();
        Keeper keeper = null;
        for(int i=0; i<quantity;i++){
        
        keeper = createKeeper();
        keeperList.add(keeper);

        }
        return keeperList;
    }
    
      public Keeper createKeeper(){
        
        Keeper keeper = new Keeper(randomKeeperName());
        String q;
        for(int i=0;i<3;i++){
            do{
                q = randomQualification();
            }while(keeper.hasQualification(q));
            keeper.setQualification(q);
        }
        
        return keeper;
    }
      
      
    public String randomQualification(){

        String[] types = {"Aquatic", "Avian", 
            "Insect", "Mammal", "MammalAquatic", "MammalAvian",
            "Reptile", "ReptileAquatic" };

        int nType = rand.nextInt(types.length); 
        return types[nType];
    }

}
