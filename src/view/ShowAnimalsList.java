/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animal.Animal;

/**
 *
 * @author fernandoms
 */
public class ShowAnimalsList extends View {
    private Animal[] animals;
    public ShowAnimalsList(Animal[] animals) {
        this.animals = animals; 
    }
    
    
    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Animals List:");
        System.out.println();
        for(Animal animal:animals){
            System.out.println(animal.shortInfo());
        }
        System.out.println();
        System.out.println("1-Detailed Info    2-Update Info    9-Return    0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        Animal result;
        switch(getInputWithLabel("Option")){
            case "1":
                result = animal().searchByExhibitNumber(getInputWithLabel("Exhibit Number"));
                if(result == null){
                    err("No Animal found with the given Exhibition Number");
                    return this;
                }
                return new ShowAnimal(result);
            case "2":
                result = animal().searchByExhibitNumber(getInputWithLabel("Exhibit Number"));
                if(result == null){
                    err("No Animal found with the given Exhibition Number");
                    return this;
                }
                return new UpdateAnimal(result); 
            case "9":
                return new AnimalMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new ShowAnimalsList(this.animals);                
        }

    }
    
}
