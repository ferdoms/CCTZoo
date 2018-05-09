/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultility;

import java.util.ArrayList;
import keeper.Keeper;

/**
 * Purpose:  this class stores animals data and performs searches through it during 
 * the system life cycle.
 * @author Joao Pedro Haddad Oliveira
 */
public class KeeperModel {
    
    ArrayList<Keeper> keepers = new ArrayList<Keeper>();
    
    public KeeperModel(ArrayList<Keeper> keepers){
        this.keepers = keepers;
    }
    
    /**
     * Purpose: stores an animal object.
     * @param Takes in an animal object.
     */  
    public void save(Keeper k){
        this.keepers.add(k);  
    } 
    
    /**
     * Search an animal by its name through the arrayList animals.
     * @param name takes in a String which is the name to be searched
     * @return an array of Animal object which has a matching name
     */    
    public Keeper[] searchByName(String name){
        ArrayList<Keeper> keeperList = new ArrayList<Keeper>();
        for(Keeper keeper:keepers){
            if(keeper.getName().equals(name)){
                keeperList.add(keeper);
            }
        }
        return keeperList.toArray(new Keeper[keeperList.size()]);   
    }
    
    /**
     * Search an animal by its Exhibition Number arrayList animals.
     * @param enumber takes in a String that represents an Exhibition Number
     * @return an Animal object.
     */  
    public Keeper searchByKeeperNumber(String number){
        
        for(Keeper keeper:keepers){
            if(keeper.getKeeperNumber().equals(number)){
                return keeper;
            }
        }
        return null;
    }
    
    /**
     * Search an animal by its specie through the animalList.
     * @param qualification
     * @param specie takes in a String that represents an Exhibition Number
     * @return an Animal object.
     */ 
    public Keeper[] searchByQualification(String qualification){
        ArrayList<Keeper> keeperList = new ArrayList<>();
        for(Keeper keeper:keepers){
//            if(keeper.getQualification().equals(qualification)){
//                keeperList.add(keeper);
//            }
        }
        return keeperList.toArray(new Keeper[keeperList.size()]);  
    }
    
    public void updateKeeper(Keeper keeper){
        keepers.set(keepers.indexOf(keeper), keeper);
    }
    
    // testing class
    public void keeperlist(){
//        for(Keeper keeper:keepers){
//            System.out.println(keeper.getQualification()+ " - " + keeper.getName() 
//                    + " The " + keeper.keeperNumber();
//        }
    }
}
