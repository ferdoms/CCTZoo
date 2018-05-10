/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import keeper.Keeper;

/**
 *
 * @author Joao Pedro Haddad Oliveira
 */
public class SearchKeeperMenu extends View{

    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Search Keeper:");
        System.out.println();
        System.out.println("1-By Keeper Number");
        System.out.println("2-By Name");
        System.out.println();
        System.out.println("9-Return");
        System.out.println("0-Exit");
        System.out.println();
    }

    @Override
        public View getOpt() {
        Keeper keeper;
        Keeper[] keeperList;
        switch(getInputWithLabel("Option")){
            case "1":
                keeper = keeper.searchByKeeperNumber()(getInputWithLabel("Keeper Number"));
                if(keeper == null){
                    err("No Keeper found with the given Keeper Number");
                    return this;
                }
                return new Keeper(result);
            case "2":
                keeperList = keeper().searchByName(getInputWithLabel("Name"));
                if(keeperList == null){
                    err("No Animal found with the given Name");
                    return this;
                }
                return new ShowKeeperList(keeperList);
            case "3":
                return new AnimalMenu();
            case "4":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new SearchKeeperMenu();                
        }
    }
  }
}
