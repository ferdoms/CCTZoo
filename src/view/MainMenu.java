/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author fernandoms
 */
public class MainMenu extends View{

    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("########## Welcome to CCTZoo ##########");
        System.out.println();
        System.out.println("1-Keeper Menu");
        System.out.println("2-Animal Menu");
        System.out.println();
        System.out.println("0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        switch(getInputWithLabel("Option")){
            case "1":
                return new KeeperMenu();
            case "2":
                return new AnimalMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again.");
                return this;
        }
        
    }
    
}
