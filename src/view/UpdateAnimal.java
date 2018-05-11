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
        System.out.println("1-Arrival date (yyyy-mm-dd): " + animal.getDateOfArrival());
        System.out.println("2-Birth date (yyyy-mm-dd): " + animal.getDateOfBirth());
        System.out.println("3-Vacine:       " + animal.isVaccinated());
        System.out.println("3-Medication:       " + animal.getMedication());
        System.out.println("3-Offspring:       " + animal.getOffSpring().length);
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
                try {
                    Date dateInput = new Date(getInputWithLabel("Arrival date (yyyy-mm-dd)"));
                    if(dateInput.compareTo(animal.getDateOfBirth())){
                        err("Arrivel date must be equals or after the date of birth.");
                    }else{
                        animal.setDateOfArrival(dateInput);
                    }
                }catch(Exception e){
                    err("Given date is invalid. Please try again.");
                }finally{
                return new UpdateAnimal(this.animal);
                }
            case "2":
                try {
                    Date dateInput = new Date(getInputWithLabel("Birth date (yyyy-mm-dd)"));
                    if(this.animal.getDateOfBirth().compareTo(dateInput)){
                        err("Birth date must be equals or after the date of Arrival.");
                    }else{
                        this.animal.setDateOfArrival(dateInput);
                    }
                }catch(Exception e){
                    err("Given date is invalid. Please try again.");
                }finally{
                return new UpdateAnimal(this.animal);
                }
            case "3":
                return new ShowAnimal(this.animal);
            case "4":
                return new ShowAnimal(this.animal);
            case "5":
                return new ShowAnimal(this.animal);
            case "9":
                return new ShowAnimal(this.animal);
            case "0":
                return new ShowAnimal(this.animal);
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new UpdateAnimal(this.animal);
        }
    }
    
}
