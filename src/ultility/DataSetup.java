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
            animal = new AnimalFactory().create(randomSpecie(), new Date().toString(),new Date().toString(), randomGender());
            animal.setName(randomName(animal.getGender()));
            animalsList.add(animal);
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
    
    public Animal createBee(){
        
        Animal Bee = new Bee(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Bee.setName(randomName(Bee.getGender()));
        return Bee;
    }
    
    public Animal createBird(){
        
        Animal Bird = new Bird(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Bird.setName(randomName(Bird.getGender()));
        return Bird;
    }
    
    public Animal createButterfly(){
        
        Animal Butterfly = new Butterfly(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Butterfly.setName(randomName(Butterfly.getGender()));
        return Butterfly;
    }
    
    public Animal createCrocodile(){
        
        Animal Crocodile = new Crocodile(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Crocodile.setName(randomName(Crocodile.getGender()));
        return Crocodile;
    }
    
    public Animal createDog(){
        
        Animal Dog = new Dog(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Dog.setName(randomName(Dog.getGender()));
        return Dog;
    }
    
    public Animal createDeer(){
        
        Animal Deer = new Deer(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Deer.setName(randomName(Deer.getGender()));
        return Deer;
    }
    
    public Animal createFish(){
        
        Animal Fish = new Fish(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Fish.setName(randomName(Fish.getGender()));
        return Fish;
    }
    
    public Animal createFrog(){
        
        Animal Frog = new Frog(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Frog.setName(randomName(Frog.getGender()));
        return Frog;
    }
    
    public Animal createGiraffe(){
        
        Animal Giraffe = new Giraffe(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Giraffe.setName(randomName(Giraffe.getGender()));
        return Giraffe;
    }
    
    public Animal createGrasshopper(){
        
        Animal Grasshopper = new Grasshopper(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Grasshopper.setName(randomName(Grasshopper.getGender()));
        return Grasshopper;
    }
    
    public Animal createHippopotamus(){
        
        Animal Hippopotamus = new Hippopotamus(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Hippopotamus.setName(randomName(Hippopotamus.getGender()));
        return Hippopotamus;
    }
    
    public Animal createHorse(){
        
        Animal Horse = new Horse(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Horse.setName(randomName(Horse.getGender()));
        return Horse;
    }
    
    public Animal createLion(){
        
        Animal Lion = new Lion(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Lion.setName(randomName(Lion.getGender()));
        return Lion;
    }
    
    public Animal createLizard(){
        
        Animal Lizard = new Lizard(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Lizard.setName(randomName(Lizard.getGender()));
        return Lizard;
    }
    
    public Animal createMonkey(){
        
        Animal Monkey = new Monkey(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Monkey.setName(randomName(Monkey.getGender()));
        return Monkey;
    }
    
    public Animal createMosquito(){
        
        Animal Mosquito = new Mosquito(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Mosquito.setName(randomName(Mosquito.getGender()));
        return Mosquito;
    }
    
    public Animal createOwl(){
        
        Animal Owl = new Owl(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Owl.setName(randomName(Owl.getGender()));
        return Owl;
    }
    
    public Animal createPanda(){
        
        Animal Panda = new Panda(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Panda.setName(randomName(Panda.getGender()));
        return Panda;
    }
    
    public Animal createParrot(){
        
        Animal Parrot = new Parrot(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Parrot.setName(randomName(Parrot.getGender()));
        return Parrot;
    }
    
    public Animal createPenguin(){
        
        Animal Penguin = new Penguin(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Penguin.setName(randomName(Penguin.getGender()));
        return Penguin;
    }
    
    public Animal createRat(){
        
        Animal Rat = new Rat(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Rat.setName(randomName(Rat.getGender()));
        return Rat;
    }
    
    public Animal createRhinocerus(){
        
        Animal Rhinocerus = new Rhinocerus(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Rhinocerus.setName(randomName(Rhinocerus.getGender()));
        return Rhinocerus;
    }
    
    public Animal createSeaLion(){
        
        Animal SeaLion = new SeaLion(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        SeaLion.setName(randomName(SeaLion.getGender()));
        return SeaLion;
    }
    
    public Animal createSeal(){
        
        Animal Seal = new Seal(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Seal.setName(randomName(Seal.getGender()));
        return Seal;
    }
    
    public Animal createSnake(){
        
        Animal Snake = new Snake(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Snake.setName(randomName(Snake.getGender()));
        return Snake;
    }
    
    public Animal createSpider(){
        
        Animal Spider = new Spider(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Spider.setName(randomName(Spider.getGender()));
        return Spider;
    }
    
    public Animal createTiger(){
        
        Animal Tiger = new Tiger(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Tiger.setName(randomName(Tiger.getGender()));
        return Tiger;
    }
    
    public Animal createToucan(){
        
        Animal Toucan = new Toucan(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Toucan.setName(randomName(Toucan.getGender()));
        return Toucan;
    }
    
    public Animal createTurtle(){
        
        Animal Turtle = new Turtle(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Turtle.setName(randomName(Turtle.getGender()));
        return Turtle;
    }
    
    public Animal createWhale(){
        
        Animal Whale = new Whale(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Whale.setName(randomName(Whale.getGender()));
        return Whale;
    }
    
    public Animal createWolf(){
        
        Animal Wolf = new Wolf(epoch.getTimestamp(),epoch.getTimestamp(), randomGender());
        Wolf.setName(randomName(Wolf.getGender()));
        return Wolf;
    }
    
    public String randomKeeperName(){
        
            String[] keeperNames = {"Olivia Adler", "Charlotte Anderson", 
                "Silas Bardot", "Declan Becker", "Oliver Becket", 
                "Noah Cohen", "Amelia Coleman", "Mia Copeland", 
                "Emma Davis", "Ava Delaney", "Luna Devlin",
                "Aria Dixon", "Isabella Duncan", "Arabella Ellis",
                "Bodhi Finley", "Mason Gibbs", "Jack Griffin", "William Hendrix",
                "Milo Hepburn", "Owen Hutton", "Jack Jennings", "Ben Jones",
                "Brian Kennedy", "Maurice Langley", "James Lennon",
                "John Lincoln", "Carl Miller", "Steven Monroe", "Ana Nash",
                "Mike Nixon", "Charles Penn", "Alan Smith", "Jack Stone", 
                "Christy Sullivan", "Noel Sutton", "Glenn Thompson", 
                "Mark Walker", "Phil West", "Aaron Whiley", "Jonnie Wilson"};
            int number = rand.nextInt(keeperNames.length);
            return keeperNames[number];
        
        
    }
    
    public ArrayList<Keeper> generateKeepers(int Quantity){
        
        ArrayList<Keeper> keeperList;
        keeperList = new ArrayList<Keeper>();
        Keeper keeper = null;
        for(int i=0; i<Quantity;i++){

            switch(rand.nextInt(40)){
                case 0:
                    keeper = createKeeper();
                    keeperList.add(keeper);
                    break;
                
                case 1:
                    keeper = createKeeper();
                    keeperList.add(keeper);
                    break;
            }
        }
        return keeperList;
    }
    
      public Keeper createKeeper(){
        
        Keeper keeper = new Keeper();
        keeper.setName(randomKeeperName());
        keeper.getName();
        keeper.getQualification();
        keeper.getKeeperNumber();
        return keeper;
    }
     
}
