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
public class KeeperMenu extends View{

    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Keeper Menu:");
        System.out.println();
        System.out.println("1-Search Menu");
        System.out.println("2-List Keepers");
        System.out.println("3-Update Keeper");
        System.out.println("4-Add Keeper");
        System.out.println();
        System.out.println("9-Return");
        System.out.println("0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        Keeper result;
        Keeper[] resultList;
        
        switch(getInputWithLabel("Option")){
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
            case "4":
                String name = getInputWithLabel("Please type first name")
                    + " " + getInputWithLabel("Please type Keeper's full name");
                Keeper newKeeper = new Keeper(name);
                keeper().save(newKeeper);
                return new UpdateKeeper(newKeeper);
            case "9":
                return new MainMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again");
                return new KeeperMenu();
        }
    }
    
}
