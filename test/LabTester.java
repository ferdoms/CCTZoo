
import animals.*;
import interfaces.Aquatic;
import interfaces.Avian;
import interfaces.Mamal;
import interfaces.MamalAvian;
import java.io.IOException;
import java.util.logging.FileHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ultility.DAO;
/**
 *
 * @author fernandoms
 */
public class LabTester {
    
    public static void main (String [] args) throws IOException  {
        
        DAO fh = new DAO("teste");
        
            
            Animal bat = new Bat("01/01/01", "01/01/01", "male", "AA", true);
            Animal bat2 = new Bat("01/01/01", "01/01/01", "male", "AA", true);
            Animal bat3 = new Bat("01/01/01", "01/01/01", "male", "AA", true);
            
            if( bat instanceof Avian){
            System.out.println(bat.toString());
            System.out.println(bat2.toString());
            System.out.println(bat3.toString());}
        
       
        
    }
}
