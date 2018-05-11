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
        System.out.println();

        for(String aExhibitNumber:keeper.getAnimalsAssigned()){
            if(aExhibitNumber!=null){
            System.out.println("  "+ animal().searchByExhibitNumber(aExhibitNumber).shortInfo());}
        }

        System.out.println();
        System.out.println("1-Qualification(s): " + keeper.getQualification());
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
                    err("Can't assign the animal because: \n  keeper doesn't care for this type;\n  keeper has already 10 animals to care for; \n  this animals has already been assigned to this Keeper");
                    
                }
                
                return new UpdateKeeper(this.keeper);  
            case "3":
                if(!keeper.unAssignAnimal(getInputWithLabel("Exhibit Number"))){
                    err("No Animal found with the given Exhibition Number");
                }
                
                return new UpdateKeeper(this.keeper); 
            case "0":
                return new ShowKeeper(this.keeper);
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new UpdateKeeper(this.keeper);
        }
    }
    
}
