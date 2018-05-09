/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keeper;

/**
 *
 * @author Joao Pedro Haddad Oliveira.
 */
public class Keeper {
    private String name;
    private String[] qualifications;
    private String[] quantity;
    private static int keeperId = 0;
    private final String keeperNumber;
    
    /**
    * constructor method passing variables to the attributes
    */
    public Keeper(String name, int keeperId){
       this.name = name;
       qualifications = new String[3];
       quantity = new String[10];
       //this.quantity = quantity;
       keeperId += 1;//increments Keeper ID by 1
       keeperNumber = Integer.toString(keeperId);//generates keeper identification number
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
    public String getQualification(){
        String result = "";
        for(int i = 0; i<qualifications.length; i++){
            if(this.qualifications[i] != null){
                result += qualifications[i];
                return result;
            }
        }
        return null;
    }
    /**
    *getQuantity method returns the total number of animals assigned to 
    * every keeper and its direct linked to identification number.
    */
//    public String[] getQuantity(){
//        return quantity;
//    }
    /**
    *setName method which can create or change any keeper`s name 
    */
    public void setName(String Name){
        this.name = name;
    }
    /**
    *getKeeperNumber returns keeper identification number
    */
    public String getKeeperNumber(){
        return keeperNumber;
        
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
        for(i=0; i < this.qualifications.length;i++){
           if(this.qualifications[i] == null){
              this.qualifications[i] = qualification;
              System.out.println(qualification);
              break;
           }
        }
    }
    /**
    *Method isAvailable validates data when any keeper is going to be assigned
    * to any new animal, if the keeper is already responsible for 10 animals
    * this method will not allow the keeper to be assigned to a new animal
    * because it has reached its limit of assignments.
    */
    
    public boolean hasQualification(String qualification){
        for(String q:qualifications){
           if(q == qualification){
              return true;
           }
        }
        return false;
    }
    
    public boolean isAvailable(){
        for(int i=0; i < this.quantity.length; i++){
            if(this.quantity[i] == null){
                return true;
        }   
      }
        return false;
    }
    
    public void assignAnimal(String onemore){
        for(int i=0; i < this.quantity.length;i++){
           if(this.quantity[i] == null){
              this.quantity[i] = onemore;
              System.out.println(onemore);
              break;
           }
        } 
    }
    
    public void unassignAnimal(String oneless){
        int i;
        for(i=0; i < this.quantity.length;i++){
           if(this.quantity[i] == oneless){
              this.quantity[i] = null;
              break;
           }
        }
    }
    
    /**
    *toString method is responsible for transforming all information 
    * into string type when displaying data to the console
    */
    public String toString(){
        String keeperInformation = "";
        keeperInformation = "Keeper identification number: " + keeperNumber
                + "\nName: " + name 
                + "\nQualification: " + qualifications 
                + "\nResponsible for " + quantity +" animals in the zoo";
        
        return keeperInformation;//show (return) data to the screen 
    }
}
