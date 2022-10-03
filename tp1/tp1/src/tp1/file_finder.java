package tp1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * file_finder prend un argument un chemin d'un dossier et ajoute dans le tableau "filerToVisit" toute les fichiers java se
 * trouvant dans le dossier
 * @param yourPath
 * @return True
 */
public class file_finder {
	  int csec;
	// Instance Variables
     String chemin;
    String paquet; 
    String classe;
    
    
 // Constructor Declaration of Class
    public  file_finder(String chemin, String paquet, String classe )
    {
        this.chemin = chemin;
        this.paquet = paquet;
        this.classe = classe;  
        this.csec = csec;
        
 
    }
    public  void file_finder_lcsec(String chemin, String paquet, String classe,int csec )
    {
        this.chemin = chemin;
        this.paquet = paquet;
        this.classe = classe;
      
 
    }
    // return chemin
    public static String getPath(File file) {
    		
    {
        return file.getAbsolutePath();
    }
    }
    // return class
    public static String fileClass(File file) {
		String name=file.getName();
		name = name.replaceFirst("[.][^.]+$", ""); // name without extension 
{
    return name;
}

}
    //return package
    public static String filepaquet(File file) {
    	ArrayList<String> list_pro = new ArrayList<>();
    	
    	String s =getPath( file);
    	String [] liste= s.split("/");
    	for (int i=0;i < liste.length; i++) {
    		list_pro.add(liste[i]);		
    	}
    	int l=list_pro.size() -2;
    	
    	list_pro.remove(0);
    	list_pro.remove(l);
    
    	String s_final = String.join(". ", list_pro);
    	s_final=s_final.replace(" ", "");
    	
    	 
    	//System.out.println(s_final);
    	//String s="";  
    	
  	return  s_final;

  }
    public static boolean isfolder(File file) {
    	boolean isDirectory = file.isDirectory();
    	return isDirectory;
    }

  // return la liste de tout les fichier dans le dossier avec leur chemin, class, paquet
    
    public static  ArrayList<file_finder> java_file_finder(String yourPath){
    	ArrayList<file_finder> list=new ArrayList<file_finder>();
          //Creating a File object for directory
          File directoryPath = new File(yourPath);
          //List of all files and directories
          File filesList[] = directoryPath.listFiles();
          
          
          for(File file : filesList) {
        	  if(file.isDirectory()==false) {
        	  String path = getPath(file);
        	  String classe = fileClass(file);
        	  String paquet = filepaquet(file);
        	  file_finder tuffy = new file_finder (path,paquet, classe);
        	  list.add(tuffy);
        	 
        	  
             
          }
        	  else {
        		  
        		  java_file_finder(file.getAbsolutePath());
        	  }
          }
          return list;
          
       } 
  
} 





