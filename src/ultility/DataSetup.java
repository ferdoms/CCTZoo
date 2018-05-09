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

            switch(rand.nextInt(34)){
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
                
                case 3:
                    animal = createBee();
                    animalsList.add(animal);
                    break;
                    
                case 4:
                    animal = createBird();
                    animalsList.add(animal);
                    break;
                    
                case 5:
                    animal = createButterfly();
                    animalsList.add(animal);
                    break;
                    
                case 6:
                    animal = createCrocodile();
                    animalsList.add(animal);
                    break;
                    
                case 7:
                    animal = createDeer();
                    animalsList.add(animal);
                    break;
                    
                case 8:
                    animal = createDog();
                    animalsList.add(animal);
                    break;    
                
                case 9:
                    animal = createFish();
                    animalsList.add(animal);
                    break;
                    
                case 10:
                    animal = createFrog();
                    animalsList.add(animal);
                    break;
                
                case 11:
                    animal = createGiraffe();
                    animalsList.add(animal);
                    break;
                    
                case 12:
                    animal = createGrasshopper();
                    animalsList.add(animal);
                    break;
                    
                case 13:
                    animal = createHippopotamus();
                    animalsList.add(animal);
                    break;
                    
                case 14:
                    animal = createHorse();
                    animalsList.add(animal);
                    break;
                    
                case 15:
                    animal = createLion();
                    animalsList.add(animal);
                    break;
                    
                case 16:
                    animal = createLizard();
                    animalsList.add(animal);
                    break;
                    
                case 17:
                    animal = createMonkey();
                    animalsList.add(animal);
                    break;
                    
                case 18:
                    animal = createMosquito();
                    animalsList.add(animal);
                    break;
                    
                case 19:
                    animal = createOwl();
                    animalsList.add(animal);
                    break;
                    
                case 20:
                    animal = createPanda();
                    animalsList.add(animal);
                    break;
                    
                case 21:
                    animal = createParrot();
                    animalsList.add(animal);
                    break;
                    
                case 22:
                    animal = createPenguin();
                    animalsList.add(animal);
                    break;
                    
                case 23:
                    animal = createRat();
                    animalsList.add(animal);
                    break;
                    
                case 24:
                    animal = createRhinocerus();
                    animalsList.add(animal);
                    break;
                    
                case 25:
                    animal = createSeaLion();
                    animalsList.add(animal);
                    break;
                    
                case 26:
                    animal = createSeal();
                    animalsList.add(animal);
                    break;    
                   
                case 27:
                    animal = createSnake();
                    animalsList.add(animal);
                    break;
                    
                case 28:
                    animal = createSpider();
                    animalsList.add(animal);
                    break;
                    
                case 29:
                    animal = createTiger();
                    animalsList.add(animal);
                    break;
                    
                case 30:
                    animal = createToucan();
                    animalsList.add(animal);
                    break;
                    
                case 31:
                    animal = createTurtle();
                    animalsList.add(animal);
                    break;
                    
                case 32:
                    animal = createWhale();
                    animalsList.add(animal);
                    break;
                    
                case 33:
                    animal = createWolf();
                    animalsList.add(animal);
                    break;
                    
            }   
        
        }
        
        return animalsList;
    }
    
    public Animal createCat(){
        
        Animal cat = new Cat(epoch.toString(),epoch.toString(), randomGender());
        cat.setName(randomName(cat.getGender()));
        return cat;
    }
    public Animal createBat(){
        
        Animal bat = new Bat(epoch.toString(),epoch.toString(), randomGender());
        bat.setName(randomName(bat.getGender()));
        return bat;
    }
    public Animal createBear(){
        
        Animal Bear = new Bear(epoch.toString(),epoch.toString(), randomGender());
        Bear.setName(randomName(Bear.getGender()));
        return Bear;
    }
    
    public Animal createBee(){
        
        Animal Bee = new Bee(epoch.toString(),epoch.toString(), randomGender());
        Bee.setName(randomName(Bee.getGender()));
        return Bee;
    }
    
    public Animal createBird(){
        
        Animal Bird = new Bird(epoch.toString(),epoch.toString(), randomGender());
        Bird.setName(randomName(Bird.getGender()));
        return Bird;
    }
    
    public Animal createButterfly(){
        
        Animal Butterfly = new Butterfly(epoch.toString(),epoch.toString(), randomGender());
        Butterfly.setName(randomName(Butterfly.getGender()));
        return Butterfly;
    }
    
    public Animal createCrocodile(){
        
        Animal Crocodile = new Crocodile(epoch.toString(),epoch.toString(), randomGender());
        Crocodile.setName(randomName(Crocodile.getGender()));
        return Crocodile;
    }
    
    public Animal createDog(){
        
        Animal Dog = new Dog(epoch.toString(),epoch.toString(), randomGender());
        Dog.setName(randomName(Dog.getGender()));
        return Dog;
    }
    
    public Animal createDeer(){
        
        Animal Deer = new Deer(epoch.toString(),epoch.toString(), randomGender());
        Deer.setName(randomName(Deer.getGender()));
        return Deer;
    }
    
    public Animal createFish(){
        
        Animal Fish = new Fish(epoch.toString(),epoch.toString(), randomGender());
        Fish.setName(randomName(Fish.getGender()));
        return Fish;
    }
    
    public Animal createFrog(){
        
        Animal Frog = new Frog(epoch.toString(),epoch.toString(), randomGender());
        Frog.setName(randomName(Frog.getGender()));
        return Frog;
    }
    
    public Animal createGiraffe(){
        
        Animal Giraffe = new Giraffe(epoch.toString(),epoch.toString(), randomGender());
        Giraffe.setName(randomName(Giraffe.getGender()));
        return Giraffe;
    }
    
    public Animal createGrasshopper(){
        
        Animal Grasshopper = new Grasshopper(epoch.toString(),epoch.toString(), randomGender());
        Grasshopper.setName(randomName(Grasshopper.getGender()));
        return Grasshopper;
    }
    
    public Animal createHippopotamus(){
        
        Animal Hippopotamus = new Hippopotamus(epoch.toString(),epoch.toString(), randomGender());
        Hippopotamus.setName(randomName(Hippopotamus.getGender()));
        return Hippopotamus;
    }
    
    public Animal createHorse(){
        
        Animal Horse = new Horse(epoch.toString(),epoch.toString(), randomGender());
        Horse.setName(randomName(Horse.getGender()));
        return Horse;
    }
    
    public Animal createLion(){
        
        Animal Lion = new Lion(epoch.toString(),epoch.toString(), randomGender());
        Lion.setName(randomName(Lion.getGender()));
        return Lion;
    }
    
    public Animal createLizard(){
        
        Animal Lizard = new Lizard(epoch.toString(),epoch.toString(), randomGender());
        Lizard.setName(randomName(Lizard.getGender()));
        return Lizard;
    }
    
    public Animal createMonkey(){
        
        Animal Monkey = new Monkey(epoch.toString(),epoch.toString(), randomGender());
        Monkey.setName(randomName(Monkey.getGender()));
        return Monkey;
    }
    
    public Animal createMosquito(){
        
        Animal Mosquito = new Mosquito(epoch.toString(),epoch.toString(), randomGender());
        Mosquito.setName(randomName(Mosquito.getGender()));
        return Mosquito;
    }
    
    public Animal createOwl(){
        
        Animal Owl = new Owl(epoch.toString(),epoch.toString(), randomGender());
        Owl.setName(randomName(Owl.getGender()));
        return Owl;
    }
    
    public Animal createPanda(){
        
        Animal Panda = new Panda(epoch.toString(),epoch.toString(), randomGender());
        Panda.setName(randomName(Panda.getGender()));
        return Panda;
    }
    
    public Animal createParrot(){
        
        Animal Parrot = new Parrot(epoch.toString(),epoch.toString(), randomGender());
        Parrot.setName(randomName(Parrot.getGender()));
        return Parrot;
    }
    
    public Animal createPenguin(){
        
        Animal Penguin = new Penguin(epoch.toString(),epoch.toString(), randomGender());
        Penguin.setName(randomName(Penguin.getGender()));
        return Penguin;
    }
    
    public Animal createRat(){
        
        Animal Rat = new Rat(epoch.toString(),epoch.toString(), randomGender());
        Rat.setName(randomName(Rat.getGender()));
        return Rat;
    }
    
    public Animal createRhinocerus(){
        
        Animal Rhinocerus = new Rhinocerus(epoch.toString(),epoch.toString(), randomGender());
        Rhinocerus.setName(randomName(Rhinocerus.getGender()));
        return Rhinocerus;
    }
    
    public Animal createSeaLion(){
        
        Animal SeaLion = new SeaLion(epoch.toString(),epoch.toString(), randomGender());
        SeaLion.setName(randomName(SeaLion.getGender()));
        return SeaLion;
    }
    
    public Animal createSeal(){
        
        Animal Seal = new Seal(epoch.toString(),epoch.toString(), randomGender());
        Seal.setName(randomName(Seal.getGender()));
        return Seal;
    }
    
    public Animal createSnake(){
        
        Animal Snake = new Snake(epoch.toString(),epoch.toString(), randomGender());
        Snake.setName(randomName(Snake.getGender()));
        return Snake;
    }
    
    public Animal createSpider(){
        
        Animal Spider = new Spider(epoch.toString(),epoch.toString(), randomGender());
        Spider.setName(randomName(Spider.getGender()));
        return Spider;
    }
    
    public Animal createTiger(){
        
        Animal Tiger = new Tiger(epoch.toString(),epoch.toString(), randomGender());
        Tiger.setName(randomName(Tiger.getGender()));
        return Tiger;
    }
    
    public Animal createToucan(){
        
        Animal Toucan = new Toucan(epoch.toString(),epoch.toString(), randomGender());
        Toucan.setName(randomName(Toucan.getGender()));
        return Toucan;
    }
    
    public Animal createTurtle(){
        
        Animal Turtle = new Turtle(epoch.toString(),epoch.toString(), randomGender());
        Turtle.setName(randomName(Turtle.getGender()));
        return Turtle;
    }
    
    public Animal createWhale(){
        
        Animal Whale = new Whale(epoch.toString(),epoch.toString(), randomGender());
        Whale.setName(randomName(Whale.getGender()));
        return Whale;
    }
    
    public Animal createWolf(){
        
        Animal Wolf = new Wolf(epoch.toString(),epoch.toString(), randomGender());
        Wolf.setName(randomName(Wolf.getGender()));
        return Wolf;
    }
     
}
