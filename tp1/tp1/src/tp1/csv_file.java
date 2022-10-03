package tp1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.PrintWriter;
public class csv_file  {
	
	public static void  creste_csv(ArrayList<file_finder> file_test ) throws IOException{
		
		File csvFile= new File("csv_file.csv");
		PrintWriter out = new PrintWriter(csvFile);
		StringBuffer csvHeader = new StringBuffer("");
	    StringBuffer csvData = new StringBuffer("");
	    csvHeader.append("chemin,paquet,classe\n");

	    // write header
	    out.write(csvHeader.toString());
		
		for(file_finder file_finder :file_test) {
			csvData.append(file_finder.chemin);
		    csvData.append(',');
		    csvData.append(file_finder.paquet);
		    csvData.append(',');
		    csvData.append( file_finder.classe);
		    csvData.append('\n');
		    
			
		}
		 out.write(csvData.toString());

		out.close();
	
	}
	
}
