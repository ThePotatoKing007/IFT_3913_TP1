package tp1;

public class test {
	// Java program to demonstrate getPackageName() method

	
		public static void main(String[] args)
			throws ClassNotFoundException
		{

			// returns the Class object for this class
			Class myClass = Class.forName("test");

			System.out.println("Class represented by myClass: "
							+ myClass.toString());

			// Get the package name of myClass
			// using getPackageName() method
			System.out.println("PackageName of myClass: "
							+ myClass.getPackageName());
		}
	}



