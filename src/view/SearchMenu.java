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
public class SearchMenu extends View {

    @Override
    public void display()  {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("1-By Exhibit Number");
        System.out.println("2-By Name");
        System.out.println("3-By Specie");
        System.out.println("4-By Type");
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
                return new ShowAnimal(result);
            case "2":
                resultList = animal().searchByName(getInputWithLabel("Name"));
                return new ShowAnimalsList(resultList);
            case "3":
                resultList = animal().searchBySpecie(getInputWithLabel("Specie"));
                return new ShowAnimalsList(resultList);
            case "4":
                resultList = animal().searchByType(getInputWithLabel("Type"));
                return new ShowAnimalsList(resultList);
            case "0":
                return null;
            default:
                return new SearchMenu();                
        }
    }
  
}
