/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animal.Animal;

import ultility.Date;

/**
 * @author thiago silva farias
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
        System.out.println("3-Medication: " + animal.getMedication());
        System.out.println("4-Vaccine: " + animal.isVaccinated());
        System.out.println("5-Offspring: " + animal.getOffSpring().length);
        for(String aExhibitNumber:animal.getOffSpring()){
            if(aExhibitNumber!=null){
                System.out.println("  "+ animal().searchByExhibitNumber(aExhibitNumber).shortInfo());}
        }
        System.out.println();
        System.out.println("0-Return");
        System.out.println();
    }
       

    @Override
    public View getOpt() {
                
        switch(getInputWithLabel("Option")){
            case "1":
                try {
                    Date dateInput = new Date(getInputWithLabel("Arrival date (yyyy-mm-dd)"));
                    if(animal.getDateOfBirth().compareTo(dateInput)){
                        animal.setDateOfArrival(dateInput);
                    }else{
                        err("Arrival date must be equals or after the date of birth.");
                    }
                }catch(Exception e){
                    err("Given date is invalid. Please try again.");
                }finally{
                return new UpdateAnimal(this.animal);
                }
            case "2":
                try {
                    Date dateInput = new Date(getInputWithLabel("Birth date (yyyy-mm-dd)"));
                    if(dateInput.compareTo(this.animal.getDateOfArrival())){
                        this.animal.setDateOfBirth(dateInput);
                    }else{
                        err("Birth date must be equals or before the date of Arrival.");
                    }
                }catch(Exception e){
                    err("Given date is invalid. Please try again.");
                }finally{
                return new UpdateAnimal(this.animal);
                }
            
            case "3":
                this.animal.setMedication(getInputWithLabel("Medication"));
                return new ShowAnimal(this.animal);
            case "4":
                this.animal.vaccinateAnimal(true);
                return new ShowAnimal(this.animal);
            case "5":
                String gender;
                do{
                    gender = getInputWithLabel("Gender");
                    if(!(gender.equalsIgnoreCase("female")) || !(gender.equalsIgnoreCase("male"))){
                        gender="";
                        err("Unable to identify the typed gender.");
                        
                    }
                }while(gender.equals(""));
                Animal newAnimal = animalFactory().create(animal.getSpecie(), new Date(), new Date(), gender);
                animal().save(newAnimal);
                this.animal.setOffSpring(newAnimal);
                return new ShowAnimal(this.animal);
            case "9":
                return new AnimalMenu();
            case "0":
                return new ShowAnimal(this.animal);
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new UpdateAnimal(this.animal);
        }
    }
    
}
