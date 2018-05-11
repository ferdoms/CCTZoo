/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Joao Pedro Haddad Oliveira
 */
public class AddKeeper extends View{
    


    @Override
    public void display() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Add New Keeper:");
        System.out.println();
        getInputWithLabel("Please type Keeper's full name");
        System.out.println();
        System.out.println("9-Return");
        System.out.println("0-Exit");
        System.out.println();
    }

    @Override
    public View getOpt() {
        case "2":
                System.out.println("Birth date:");
                day = getInputWithLabel("Day");
                month = getInputWithLabel("Month");
                year = getInputWithLabel("Year");
                
                date = year + "-" + month + "-" + day;
                
                
                animal.setDateOfArrival(date);
                
                
                
                return new UpdateAnimal(this.animal);  
    }
    
}
