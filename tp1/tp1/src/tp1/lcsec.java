package tp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class lcsec extends file_finder {
	
	 
	 public lcsec(String chemin, String paquet, String classe, int csec) {
		super(chemin, paquet, classe);
		this.csec= csec;

	}
	 
	// cette fonction return true si les deux classes sont couplees et false si non
	 public static boolean les_classes_sont_couplees(String name_classe,String yourPath)  {
		 Scanner txtscan;
		try {
			txtscan = new Scanner(new File(yourPath));
			 while(txtscan.hasNextLine()){
			     String str = txtscan.nextLine();
			     if(str.indexOf(name_classe) != -1){
			    	 return true;
			         
			     }
			 }
				return false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		     
		 
		return false;
		 
	 }
	 // cette fct retourne couplage simple entre classes

	 public static ArrayList<Integer>  lcsec_i(ArrayList<file_finder> file_test ) throws IOException{
		 ArrayList<Integer> couplage = new ArrayList<>();
		int o= 0;
		int len =file_test.size();
		for (int i = 0; i<len ; i++) {
			for(int j =0;j<len ; j++) { 
				if (j !=i) {
					if(les_classes_sont_couplees(file_test.get(i).classe,file_test.get(j).chemin)){
						o+=1;
						
					
				}
				
			}
		}
			couplage.add(o);
			
		}
		return couplage;
			
		}
	 
	 // cette fct retourne le resultat demandee pour la partie 2
	 public static void  lcsec_output(ArrayList<file_finder> file_test ) throws IOException{
		 ArrayList<Integer> couplage=lcsec_i(file_test);
		 int i =0;
			for(file_finder file_finder :file_test) {
				System.out.println(file_finder.chemin+", "+ file_finder.paquet+", "+file_finder.classe+", "+String.valueOf(couplage.get(i)));
			}
		}
		
		 
	 }


