/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;
import keeper.Keeper;
import ultility.Date;

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
        System.out.println("1-Name: " + keeper.getName());
        System.out.println("2-Qualification:   " + keeper.getQualification());
        System.out.println("3-Quantity of Animal assigned:       " + keeper.getAmountOfAnimals());
        System.out.println();
        System.out.println("0-Return");
        System.out.println();
    }
       

    @Override
    public View getOpt() {
        String fname;
        String lname;
        String fullName;
        
        switch(getInputWithLabel("Option")){
            case "1":
                System.out.println("Updating Name:");
                fname = getInputWithLabel("First name");
                lname = getInputWithLabel("Last name");
                
                fullName = fname +" "+ lname;
                keeper.setName(fullName);
                
                return new UpdateKeeper(this.keeper);
            case "2":
                System.out.println("Updating Name:");
                fname = getInputWithLabel("First name");
                lname = getInputWithLabel("Last name");
                
                fullName = fname +" "+ lname;
                keeper.setName(fullName);
                
                return new UpdateKeeper(this.keeper);
                
            case "0":
                return new ShowKeeper(this.keeper);
            default:
                System.out.println("Please make sure to type one of the available options");
                return new UpdateKeeper(this.keeper);
        }
    }
    
}
