/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import keeper.Keeper;

/**
 * Purpose: is to print a detailed animal info
 * @author Joao Pedro Haddad Oliveira
 */
public class ShowKeeper extends View{
    private Keeper keeper;
    
    /**
     *
     * @param Keeper
     */ 
    
    public ShowKeeper(Keeper k){
        this.keeper = k;
    }

    @Override
    public void display() {
       System.out.println("====================================================");
        System.out.println();
        System.out.println("\tKeeper detailed info");
        if(keeper == null){
            System.out.println("No Keeper found with given Identification Number");
        }else{
            
            System.out.println();
            System.out.println(keeper.toString());
        }
        System.out.println();
        System.out.println("1-Return    2-Update Info    0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        switch(getInputWithLabel("Option")){
            case "1":
                return new KeeperMenu();
            case "2":
                return new UpdateKeeper(this.keeper);  
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new ShowKeeper(this.keeper); 
        }
    }
}
