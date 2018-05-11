/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;
import keeper.Keeper;


/**
 *
 * @author fernandoms
 */
public class UpdateKeeper extends View {

    private Keeper keeper;
    public UpdateKeeper(Keeper k){
        this.keeper = k;
    }
    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Update keeper info:");
        System.out.println();
        System.out.println(keeper.shortInfo());
        System.out.println("This is responsable for " + keeper.getAmountOfAnimals() + "animal(s)");
        System.out.println();
        for(String aExhibitNumber:keeper.getAnimalsAssigned()){
            System.out.println("  "+ animal().searchByExhibitNumber(aExhibitNumber).shortInfo());
        }
        System.out.println();
        System.out.println("1-Qualification: " + keeper.getQualification());
        System.out.println("2-Assign Animal");
        System.out.println("3-Unassing Animal");
        System.out.println();
        System.out.println("0-Return");
        System.out.println();
    }
       

    @Override
    public View getOpt() {
        switch(getInputWithLabel("Option")){
            case "1":
                if(keeper.getAmountOfAnimals()!=0){
                    err("This keeper must have no assigned Animal to change its qualification.");
                    return new UpdateKeeper(this.keeper);
                }
                System.out.println("new ChangeQualification(this.keeper)");
                return this;
            case "2":
                Animal result = animal().searchByExhibitNumber(getInputWithLabel("Exhibit Number"));
                if(result == null){
                    err("No Animal found with the given Exhibition Number");
                    return this;
                }
                if(!keeper.assignAnimal(result)){
                    err("Can't assign");
                    
                }
                
                return new UpdateKeeper(this.keeper);  
            case "0":
                //return new ShowKeeper(this.keeper);
            default:
                System.out.println("Please make sure to type one of the available options");
                return new UpdateKeeper(this.keeper);
        }
    }
    
}
