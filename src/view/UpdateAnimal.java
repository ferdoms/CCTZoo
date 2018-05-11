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
public class UpdateAnimal extends View {

    private Animal animal;
    public UpdateAnimal(Animal a){
        this.animal = a;
    }
    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Update animal info:");
        System.out.println();
        System.out.println(animal.shortInfo());
        System.out.println();
        System.out.println("1-Arrival date: " + animal.getDateOfArrival());
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
                
                return new UpdateAnimal(this.animal);
            case "2":
                System.out.println("Birth date:");
                day = getInputWithLabel("Day");
                month = getInputWithLabel("Month");
                year = getInputWithLabel("Year");
                
                date = year + "-" + month + "-" + day;
                
                
                animal.setDateOfArrival(date);
                
                
                
                return new UpdateAnimal(this.animal);  
            case "0":
                return new ShowAnimal(this.animal);
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new UpdateAnimal(this.animal);
        }
    }
    
}
