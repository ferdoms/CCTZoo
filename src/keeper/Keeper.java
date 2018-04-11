/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keeper;

/**
 *
 * @author joao-
 */
public class Keeper {
    private String name;
    public String[] qualification;
    private int quantity;
    
    public Keeper(String name, int quantity){
       this.name = name;
       qualification = new String[3];
       this.quantity = quantity;
    }
    /**
    *simple public method get name to get the name attribute and return it when 
    *requested by other methods
    */
    public String getName(){
        return name;
    }
    /**
    *setQualification method which can change any keeper`s qualification or 
    * create/set qualification to new keeper in the zoo. We are going to create
    * three getQualification methods and three setQualification methods 
    * because a Keeper can be qualificated at a maximum of 
    * three types of animals
    */
    public String[] getQualification(){
        return qualification;
    }
    public int getQuantity(){
        return quantity;
    }
    /**
    *setName method which can create or change any keeper`s name 
    */
    public void setName(String Name){
        this.name = name;
    }
    /**
    *setQualification method which can change any keeper`s qualification or 
    * create/set qualification to new keeper in the zoo. We are going to create
    * three getQualification methods and three setQualification methods 
    * because a Keeper can be qualificated at a maximum of three types 
    * of animals
    */
    public void setQualification(String qualification){
        int i;
        for(i=0; i < this.qualification.length;i++){
           if(this.qualification[i] == null){
              this.qualification[i] = qualification;
              System.out.println(qualification);
              break;
           }
        }
    }
    
    public boolean isAvailable(){
        this.quantity = getQuantity();
        if(this.quantity <= 10){
            return true;
        }
        return false;
    }
}
