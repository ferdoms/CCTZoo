/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import keeper.Keeper;

/**
 *
 * @author fernandoms
 */
public class EditQualification extends View{

    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Choose Qualification:");
        System.out.println();
        System.out.println("1-Aquatic");
        System.out.println("2-Avian");
        System.out.println("3-Insect");
        System.out.println("4-Mammal");
        System.out.println("5-Mammal Aquatic");
        System.out.println("6-Mammal Avian");
        System.out.println("7-Reptile");
        System.out.println("8-Reptile Aquatic");
        System.out.println();
        System.out.println("9-Return");
        System.out.println("0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        Keeper qualification;
        Keeper[] qualificationList;
        
        switch(getInputWithLabel("Option")){
            case "1":
                qualification = Keeper.setQualification();
                return new SearchKeeperMenu();
            case "2":
                resultList = keeper().all();
                return new ShowKeeperList(resultList);
            case "3":
                result = keeper().searchByKeeperNumber(getInputWithLabel("Keeper ID"));
                if(result == null){
                    err("No keeper found with the given Keeper ID");
                    return this;
                }
                return new UpdateKeeper(result);
                case "1":
                return new SearchKeeperMenu();
            case "2":
                resultList = keeper().all();
                return new ShowKeeperList(resultList);
            case "3":
                result = keeper().searchByKeeperNumber(getInputWithLabel("Keeper ID"));
                if(result == null){
                    err("No keeper found with the given Keeper ID");
                    return this;
                }
                return new UpdateKeeper(result);
                
            case "2":
                resultList = keeper().all();
                return new ShowKeeperList(resultList);
            case "3":
                result = keeper().searchByKeeperNumber(getInputWithLabel("Keeper ID"));
                if(result == null){
                    err("No keeper found with the given Keeper ID");
                    return this;
                }
                return new UpdateKeeper(result);
            case "9":
                return new MainMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again");
                return new EditQualification();
        }
    }
    }
    
}
