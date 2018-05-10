/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Fernando Marinho da Silva
 */
public abstract class Animal {
    private String dateOfBirth;
    private String dateOfArrival;
    private String gender;
    private Integer OffSpring = null;// to Object
    private String medication = null;// to Object
    private boolean vaccine = false;
    private static int serial = 1000;   
    private final String exhibitNumber; 
    private String name;
    //raca string
    

    public Animal(String dateOfBirth, String dateOfArrival, String gender) {
        this.dateOfBirth = dateOfBirth;
        this.dateOfArrival = dateOfArrival;
        this.gender = gender;
        this.OffSpring = 0;
        this.medication = medication;
        this.vaccine = vaccine;
        serial = serial+1;
        exhibitNumber = Integer.toString(serial);
       
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public String getGender() {
        return gender;
    }

    public int getOffSpring() {
        return OffSpring;
    }

    public String getMedication() {
        return medication;
    }

    public boolean isVaccinated() {
        return vaccine;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOffSpring(int OffSpring) {
        this.OffSpring = OffSpring;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setVaccine(boolean vaccine) {
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
                + "\n Name = " + name + " the " + getSpecie()
                + "\n Type = " + getType()
                + "\n Date Of Birth = " + dateOfBirth + "\n Date Of Arrival = " + dateOfArrival + ""
                + "\n Gender =  " + gender + "\n OffSpring = " + OffSpring + "\n Medication = " + medication + ""
                + "\n Vaccine = " + vaccine + "\n ExhibitnNumber = " + exhibitNumber;
    }
    private abstract class OffSpring{
        abstract Animal setOffSpring();
    }
    
}

