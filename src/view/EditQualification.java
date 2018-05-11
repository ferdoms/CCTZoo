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
public class EditQualification extends View{
    private Keeper keeper;
    
    public EditQualification(Keeper k){
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
                keeper.setQualification("Aquatic");
                return new EditQualification(keeper);
            case "2":
                keeper.setQualification("Avian");
                return new EditQualification(keeper);
            case "3":
                keeper.setQualification("Insect");
                return new EditQualification(keeper);
            case "4":
                keeper.setQualification("Mammal");
                return new EditQualification(keeper);
            case "5":
                keeper.setQualification("Mammal Aquatic");
                return new EditQualification(keeper);
            case "6":
                keeper.setQualification("Mammal Avian");
                return new EditQualification(keeper);
            case "7":
                keeper.setQualification("Reptile");
                return new EditQualification(keeper);
            case "8":
                keeper.setQualification("Reptile Aquatic");
                return new EditQualification(keeper);
            case "9":
                return new MainMenu();
            case "0":
                return null;
            default:
                err("Unable to indentify the typed option. Please try again");
                return new EditQualification(keeper);
        }
    }
    }
    

