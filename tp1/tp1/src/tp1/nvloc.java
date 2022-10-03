package tp1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class nvloc {
	/**
	 * file_finder prend un argument un chemin et retourne nombre de lignes de code non-vides
	 * @param yourPath
	 * @return long
	 */
	public static long nvlocs(String path) throws IOException{
		
		long ligne_non_vide = Files.lines(Paths.get(path)).filter(line -> line.length() > 0).count();		
		
		return  ligne_non_vide;
		}
}


	