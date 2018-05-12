package view;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package view;

import keeper.Keeper;
import view.MainMenu;
import view.View;

/**
 *
 * @author fernandoms
 */
public class AddQualification extends View{
    private Keeper keeper;
    
    public AddQualification(Keeper k){
        this.keeper = k;
    
    }
        
    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Choose Qualification:");
        System.out.println();
        System.out.println(keeper.shortInfo());
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
        
        switch(getInputWithLabel("Option")){
            case "1":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("Aquatic");
                return new AddQualification(keeper);
            case "2":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("Avian");
                return new AddQualification(keeper);
            case "3":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("Insect");
                return new AddQualification(keeper);
            case "4":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("Mammal");
                return new AddQualification(keeper);
            case "5":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("MammalAquatic");
                return new AddQualification(keeper);
            case "6":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("MammalAvian");
                return new AddQualification(keeper);
            case "7":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("Reptile");
                return new AddQualification(keeper);
            case "8":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                keeper.setQualification("ReptileAquatic");
                return new AddQualification(keeper);
            case "9":
                if(!keeper.canQualificate()){
                    err("This keeper has already 3 qualifications.");
                    return new ShowKeeper(keeper);
                }
                return new KeeperMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again");
                return new AddQualification(keeper);
        }
    }
    }
    

