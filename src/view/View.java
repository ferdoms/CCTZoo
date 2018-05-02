/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animals.Animal;
import java.util.Scanner;
import ultility.AnimalModel;
import ultility.Epoch;


/**
 * Purpose: this class was created to standardize methods that all of the VIEWS 
 *          has to implement or to inherit. All classes which represents a view
 *          screen must extends this class.
 * 
 * 
 * @author fernandoms
 */
public abstract class View {
    
    Scanner kb = new Scanner(System.in);//get input from the user
    
    private AnimalModel animalModel;
    /**
     * Purpose: abstract method which prints the view to console.
     */
    public abstract void display();

    /**
     * Purpose: process user option input. Each child class has its on options
     * and so its on implementation;
     * 
     * @return View or null
     */
    public abstract View getOpt();
    private boolean exit = false;

        
    /**
     * Purpose: The getInputWithLabel is a method to get input using scanner showing a label.
     * It returns the input as a String.
     * @param label
     * @return user input
     */
    public String getInputWithLabel(String label){
        String input;
        System.out.print(label + ": ");
        input = kb.next();
        System.out.println();
        return input;        
    }
    /**
     * The getInput is a method to get input using scanner.
     * It returns the input as a String.
     * @return user input
     */
    public String getInput(){
        String input = kb.next();
        System.out.println();
        return input;   
    }

    /**
     *
     * @param a
     */
    public void fetchData(AnimalModel a){
        this.animalModel = a;
    }

    /**
     *
     * @return 
     */
    public AnimalModel animal(){
        return animalModel;
    }
    
    /**
     *
     */
    public void quit(){
        exit = true;
    }

    /**
     *
     * @return
     */
    public boolean getExit(){
        return exit;
    }
    
    public Epoch epoch(){
        return new Epoch();
    }
    
}
