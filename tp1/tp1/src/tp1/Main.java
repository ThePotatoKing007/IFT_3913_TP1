package tp1;

import java.io.IOException;
import java.util.ArrayList;


public class Main {

    /**
     *
     * @param args
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	String path_folder="";//Le chemin absoludu dossier pour file_finder
    	String path_file="";//Le chemin absolu du fichier dans le dossier precedent 
    	ArrayList<file_finder> file_test=file_finder.java_file_finder(path_folder);
  
    	// jls output [partie 0]
    	System.out.println("Reponse de la partie 0");
    	jls.jls_output(file_test);
    	
    	// write jls output t csv file
    	System.out.println("creation du fichier csv");
    	csv_file.creste_csv(file_test);
    	
    	// partie 1
    	System.out.println("Reponse de la partie 1");
    	double test=nvloc.nvlocs(path_file);
    	
    	System.out.println("Total Number of Lines: " + test);
    	
    	// partie 3
    	System.out.println("Reponse de la partie 2");
    	lcsec.lcsec_output(file_test);
    	
    	
    	
    	
    
    

    	

   
    
}
}
