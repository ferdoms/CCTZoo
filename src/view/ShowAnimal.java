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
    }

    @Override
    public View getOpt() {
        switch(getInputWithLabel("Option")){
            case "1":
                return new SearchMenu();
            case "0":
                return null;
            default:
                System.out.println("Error");
                return new ShowAnimal(this.animal);                
        }
    }
    
    
}
