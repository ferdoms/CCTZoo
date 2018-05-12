/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animal.Animal;
import java.util.Scanner;
import animal.AnimalModel;
import keeper.KeeperModel;
import ultility.AnimalFactory;

/**
 * Purpose: this class was created to standardize methods that all of the VIEWS 
 *          has to implement or to inherit. All classes which represents a view
 *          screen must extends this class.
 * @author fernandoms
 */
public abstract class View {
    
    Scanner kb = new Scanner(System.in);//get input from the user
    
    private AnimalModel animalModel;
    private KeeperModel keeperModel;
    private AnimalFactory animalFactory = new AnimalFactory();
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
     * Fetch data from the models
     * @param a
     */
    public void fetchData(AnimalModel a, KeeperModel k){
        this.animalModel = a;
        this.keeperModel = k;
    }

    /**
     * Grant access to animal model and its classes
     * @return 
     */
    public AnimalModel animal(){
        return animalModel;
    }
    /**
     * Grant access to keeper model and its classes
     * @return 
     */
    public KeeperModel keeper(){
        return keeperModel;
    }
    
    public AnimalFactory animalFactory(){
        return animalFactory;
    }
    /**
     * Prints errors to console.
     * 
     */
    public void err(String error){
        System.err.println("ERROR: " + error);
    }
    
}
