/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animal.Animal;

/**
 *
 * @author Fernando Marinho da Silva
 */
public class SearchAnimalMenu extends View {

    @Override
    public void display()  {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Search Animal:");
        System.out.println();
        System.out.println("1-By Exhibit Number");
        System.out.println("2-By Name");
        System.out.println("3-By Specie");
        System.out.println("4-By Type");
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
                result = animal().searchByExhibitNumber(getInputWithLabel("Exhibit Number"));
                if(result == null){
                    err("No Animal found with the given Exhibition Number");
                    return this;
                }
                return new ShowAnimal(result);
            case "2":
                resultList = animal().searchByName(getInputWithLabel("Name"));
                if(resultList == null){
                    err("No Animal found with the given Name");
                    return this;
                }
                return new ShowAnimalsList(resultList);
            case "3":
                resultList = animal().searchBySpecie(getInputWithLabel("Specie"));
                if(resultList == null){
                    err("No Animal found with the given Specie");
                    return this;
                }
                return new ShowAnimalsList(resultList);
            case "4":
                resultList = animal().searchByType(getInputWithLabel("Type"));
                if(resultList == null){
                    err("No Animal found with the given Type");
                    return this;
                }
                return new ShowAnimalsList(resultList);
            case "9":
                return new AnimalMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new SearchAnimalMenu();                
        }
    }
  
}
