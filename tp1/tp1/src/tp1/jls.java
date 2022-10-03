package tp1;

import java.util.ArrayList;
import java.io.*;  
import java.util.Scanner;  
public class jls {
	public static void  jls_output(ArrayList<file_finder> file_test ) throws IOException{
		for(file_finder file_finder :file_test) {
			System.out.println(file_finder.chemin+", "+ file_finder.paquet+", "+file_finder.classe);
		}
	}
}

