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
    private String qualification;
    
    public Keeper(String name, String qualification){
       this.name = name;
       this.qualification = qualification;
    }
    /**
    *simple public method get name to get the name attribute and return it when 
    *requested by other methods
    */
    public String getName(){
        return name;
    }
    /**
    *simple public method get qualification to get the qualification attribute and return it when 
    *requested by other methods
    */
    public String qualification(){
        return qualification;
    }
    /**
    *setName method which can create or change any keeper`s name 
    */
    public void setName(String Name){
        this.name = name;
    }
    /**
    *setQualification method which can change any keeper`s qualification or 
    * create/set qualification to new keeper in the zoo
    */
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
}
