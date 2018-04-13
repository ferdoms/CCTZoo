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
public class DAO {
    
    private static Path path;
    private File file;
    private Logger logger = new Logger();
    private String fileName;
    
    public DAO(String fileName){
        fileName = fileName + ".txt";
        path = FileSystems.getDefault().getPath("src","resources", fileName);
        createsTXT();
    }
    
    private void createsTXT(){
                
        try {
	    file = new File(path.toString());
	    if (file.createNewFile()){
	        logger.log("File '" + fileName + "'has been created successfully");
	    }
	    else{
	        logger.log("File '" + fileName + "'has been opened successfully");
	    }
    	} catch (IOException e) {
    		logger.log("Exception Occurred:");
	        e.printStackTrace();
	  }
        
    }
    
    public void append(String data) {

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            /* The three statements below will add three 
           * Strings to the file in new lines.
             */
            pw.println(data);
            pw.close();

            logger.log("Data successfully appended at the end of file" + fileName);

        } catch (IOException ioe) {
            logger.log("Exception occurred on appendding to " + fileName);
            ioe.printStackTrace();
        }
    }
    
    
}
