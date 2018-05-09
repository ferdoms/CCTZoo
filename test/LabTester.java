
import animals.*;
import cctzoo.Controller;
import interfaces.Aquatic;
import interfaces.Avian;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import ultility.AnimalModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ultility.DataSetup;
import interfaces.Mammal;
import interfaces.MammalAvian;
import ultility.Epoch;
import view.SearchAnimalMenu;
import view.ShowAnimal;
import view.View;
/**
 *
 * @author fernandoms
 */
public class LabTester {
    
    public static void main (String [] args) throws IOException  {
//        
//        DAO fh = new DAO("teste");
//        AnimalModel am = new AnimalModel();
//        
//            
//            Animal bat = new Bat("01/01/01", "01/01/01", "male", "AA", true);
//            Animal bat2 = new Bat("01/01/01", "01/01/01", "male", "AA", true);
//            Animal bat3 = new Bat("01/01/01", "01/01/01", "male", "AA", true);
//           
            
        
//        DataSetup ds = new DataSetup();
//        ArrayList<Animal> animals = ds.generateAnimals(20);
//        AnimalModel am = new AnimalModel(animals);
//
//        for(Animal animal:animals){
//            System.out.println(animal.getName() + " The " + animal.getSpecie() + " - " + animal.getGender() + " - " + animal.getType());
//        }
//        System.out.println("Result Search");
//        Animal[] result = am.searchByType("Mammal");
//        for(Animal animal:result){
//            System.out.println(animal.getName() + " The " + animal.getSpecie() + " - " + animal.getGender() + " - " + animal.getType());
//        }
//        Animal animal = animals.get(2);
//        System.out.println("before change");
//        System.out.println(animal.getName() + " The " + animal.getSpecie());
//        System.out.println();
//        
//        animal.setName("Fernando");
//        System.out.println("After change");
//        System.out.println(animal.getName() + " The " + animal.getSpecie());
//        System.out.println();
//        
//        am.update(animal);
//        am.list();

        Controller ctrl = new Controller();
        ctrl.start();
        while(!ctrl.exit()){
        ctrl.update();
        }
//          Animal[] animalsList = am.all();
//          for(Animal a:animalsList){
//              System.out.println(a.shortInfo());
//          }
        
        
    }
}
