/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;

/**
 * Purpose: is to print a detailed animal info
 * @author fernandoms
 */
public class ShowAnimal extends View {
    private Animal animal;

    /**
     *
     * @param Animal
     */
    public ShowAnimal(Animal a){
        this.animal = a;
    }
    
    
    @Override
    public void display(){
        System.out.println("====================================================");
        System.out.println();
        if(animal == null){
            System.out.println("No Animal found with given Exhibition Number");
        }else{
            System.out.println("\tAnimal detailed info");
            System.out.println();
            System.out.println(animal.toString());
        }
        System.out.println();
        System.out.println("1-Return    2-Update Info    0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        switch(getInputWithLabel("Option")){
            case "1":
                return new SearchAnimalMenu();
            case "2":
                return new UpdateAnimal(this.animal);  
            case "0":
                return null;
            default:
                System.out.println("Please make sure to type one of the available options");
                return new ShowAnimal(this.animal);                
        }
    }
    
    
}
