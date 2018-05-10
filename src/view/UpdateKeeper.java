/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;
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
        System.out.println("1-Qualification: " + animal.getDateOfArrival());
        System.out.println("2-Birth date:   " + animal.getDateOfBirth());
        System.out.println("3-Vacine:       " + animal.isVaccinated());
        System.out.println();
        System.out.println("0-Return");
        System.out.println();
    }
       

    @Override
    public View getOpt() {
        String day;
        String month;
        String year;
        String date;
        
        switch(getInputWithLabel("Option")){
            case "1":
                System.out.println("Arrival date:");
                day = getInputWithLabel("Day");
                month = getInputWithLabel("Month");
                year = getInputWithLabel("Year");
                
                date = year + "-" + month + "-" + day;
                animal.setDateOfArrival(date);
                
                return new UpdateKeeper(this.animal);
            case "2":
                System.out.println("Birth date:");
                day = getInputWithLabel("Day");
                month = getInputWithLabel("Month");
                year = getInputWithLabel("Year");
                
                date = year + "-" + month + "-" + day;
                
                
                animal.setDateOfArrival(date);
                
                
                
                return new UpdateKeeper(this.animal);  
            case "0":
                return new ShowAnimal(this.animal);
            default:
                System.out.println("Please make sure to type one of the available options");
                return new UpdateKeeper(this.animal);
        }
    }
    
}
