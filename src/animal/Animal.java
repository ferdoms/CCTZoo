/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.ArrayList;
import java.util.Random;
import ultility.AnimalFactory;
import ultility.Date;

/**
 *
 * @author Fernando Marinho da Silva
 */
public abstract class Animal {
    private Date dateOfBirth;
    private Date dateOfArrival;
    private String gender;
    private ArrayList<String> OffSpring = new ArrayList<String>();
    private String medication = "None";
    private boolean vaccine = false;
    private static int serial = 1000;   
    private final String exhibitNumber; 
    private String name;
    //raca string
    

    public Animal(Date dateOfBirth, Date dateOfArrival, String gender) {
        this.dateOfBirth = dateOfBirth;
        this.dateOfArrival = dateOfArrival;
        this.gender = gender;
        this.medication = medication;
        this.vaccine = vaccine;
        serial = serial+1;
        exhibitNumber = Integer.toString(serial);
       
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public String getGender() {
        return gender;
    }

    public String[] getOffSpring() {
//        if(OffSpring.isEmpty()){
//            return null;
//        }
//        
        return OffSpring.toArray(new String[OffSpring.size()]);
    }

    public String getMedication() {
        return medication;
    }

    public boolean isVaccinated() {
        return vaccine;
    }


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        
        this.dateOfArrival = dateOfArrival;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOffSpring(Animal animal) {
        this.OffSpring.add(animal.getExhibitNumber());
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void vaccinateAnimal(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public String getExhibitNumber() {
        return exhibitNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSpecie(){
        return this.getClass().getSimpleName();
    }
    
    public String getType(){
        return this.getClass().getInterfaces()[0].getSimpleName();
    }
    public String shortInfo(){
        return this.getExhibitNumber() + " - " + this.getName() + " - " + this.getSpecie() + " - " + this.getType();
    }
    
    
    @Override
    public String toString() {
        return "Animal info:" 
                + "\n Name: " + name + " the " + getSpecie()
                + "\n Type: " + getType()
                + "\n Date Of Birth: " + dateOfBirth + "\n Date Of Arrival: " + dateOfArrival + ""
                + "\n Gender:  " + gender + "\n Medication: " + medication + ""
                + "\n Vaccine: " + vaccine + "\n ExhibitnNumber: " + exhibitNumber
                + "\n OffSpring: " + getOffSpring().length;
    }
//    private abstract class OffSpring{
//        Random rand =  new Random();
//        
//        Animal generateOffSpring(String type){
//            AnimalFactory af = new AnimalFactory();
//            return af.create(type, new Date(), new Date(), gender);
//            
//        }
//        String randomGender(){
//            if(rand.nextInt(2) == 1){
//                return "male";
//            }
//            return "female";
//        }
//    }
    
}

