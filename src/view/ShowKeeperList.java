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
public class ShowKeeperList extends View {
    
    private Keeper[] keepers;
    
    public ShowKeeperList(Keeper[] keepers){
        this.keepers = keepers;
    }

    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Animals List:");
        System.out.println();
        for(Keeper keeper:keepers){
            System.out.println(keeper.shortInfo());
        }
        System.out.println();
        System.out.println("1-Detailed Info    2-Update Info    9-Return    0-Exit");
        System.out.println();
        
        
        
    }

    @Override
    public View getOpt() {
        Keeper result;
        switch(getInputWithLabel("Option")){
            case "1":
                result = keeper().searchByKeeperNumber(getInputWithLabel("Keeper ID"));
                if(result == null){
                    err("No keeper found with the given Keeper ID");
                    return this;
                }
                System.out.println("new ShowKeeper(result)");
                return this;
            case "2":
                result = keeper().searchByKeeperNumber(getInputWithLabel("Keeper ID"));
                if(result == null){
                    err("No keeper found with the given Keeper ID");
                    return this;
                }
                return new UpdateKeeper(result); 
            case "9":
                return new KeeperMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return new ShowKeeperList(this.keepers);                
        }
    }
    
}
