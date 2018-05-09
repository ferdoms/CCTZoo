/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;

/**
 *
 * @author Fernando Marinho da Silva
 * 
 */
public class AnimalMenu extends View{

    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Animal Menu:");
        System.out.println();
        System.out.println("1-Search Menu");
        System.out.println("2-List Animals");
        System.out.println("3-Update Animal");
        System.out.println();
        System.out.println("9-Return");
        System.out.println("0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        Animal result;
        Animal[] resultList;
        switch(getInputWithLabel("Option")){
            case "1":
                return new SearchAnimalMenu();
            case "2":
                resultList = animal().all();
                return new ShowAnimalsList(resultList);
            case "3":
                result = animal().searchByExhibitNumber(getInputWithLabel("Exhibit Number"));
                return new ShowAnimal(result);
            case "9":
                return new MainMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again");
                return new SearchAnimalMenu();
        }
    }
    
}
