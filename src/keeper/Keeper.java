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
    private String qualification1;
    private String qualification2;
    private String qualification3;
    
    public Keeper(String name, String qualification1, String qualification2,
            String qualification3){
       this.name = name;
       this.qualification1 = qualification1;
       this.qualification2 = qualification2;
       this.qualification3 = qualification3;
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
    public String getQualification1(){
        return qualification1;
    }
    public String getQualification2(){
        return qualification2;
    }
    public String getQualification3(){
        return qualification3;
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
    public void setQualification1(String qualification1){
        this.qualification1 = qualification1;
    }
    public void setQualification2(String qualification2){
        this.qualification2 = qualification2;
    }
    public void setQualification3(String qualification3){
        this.qualification3 = qualification3;
    }
}
