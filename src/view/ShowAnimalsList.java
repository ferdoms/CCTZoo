/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;

/**
 *
 * @author fernandoms
 */
public class ShowAnimalsList extends View {
    Animal[] animals;
    public ShowAnimalsList(Animal[] animals) {
        this.animals = animals; 
    }
    
    
    @Override
    public void display() {
        // improve this screen
        
        for(Animal animal:animals){
            System.out.println(animal.shortInfo());
        }
    }

    @Override
    public View getOpt() {
        switch(getInputWithLabel("Option")){
            case "1":
                return new SearchAnimalMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new ShowAnimalsList(this.animals);                
        }

    }
    
}
