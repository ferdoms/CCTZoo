/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultility;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

/**
 *
 * @author fernandoms
 */
public class Logger {
    
    private static Path path;
    private File file;
    private final Epoch epoch  = new Epoch();
    
    public Logger(){

        path = FileSystems.getDefault().getPath("src","resources", "log.txt");
        createsLogFile();
    }
    
    private void createsLogFile(){
                
        try {
	    file = new File(path.toString());
            file.createNewFile();
            
    	} catch (IOException e) {
    		System.out.println("Exception Occurred:");
	        e.printStackTrace();
	  }
        
    }
    
    public void log(String logText) {

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            /* The three statements below will add three 
           * Strings to the file in new lines.
             */
            pw.println(epoch.getTimestamp() +" - "+ logText);
            pw.close();

            System.out.println("Data successfully appended at the end of file");

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
    
}
