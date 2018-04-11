/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import keeper.Keeper;

/**
 *
 * @author fernandoms
 */
public class ZooManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Keeper keeper = new Keeper("Tiago","Mamal","Reptile","Avisn",9);
        System.out.println(keeper.isAvailable());
        
    }
    
}
