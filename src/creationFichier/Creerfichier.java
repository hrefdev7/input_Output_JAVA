package creationFichier;

import java.io.File;
import java.util.Scanner;



public class Creerfichier {
	static boolean append = true;
	public static void main(String[] args) throws Exception {
		
		ReaderWriter g =new ReaderWriter();
        System.out.println("********************Creation Fichier avec METHODE $createNewFile$***************\"\n");
        System.out.println("--------------------------------------------------------------------------------");
		 System.out.println("Entrer le nom de fichier avec son extension : "+"\n");
	        
		  Scanner sc2=new Scanner(System.in);
		    	 
		String h2=sc2.next(); //reads string before the space 
		File f2=g.createfile(h2);
		g.a9ra(f2);
		System.out.println("***********************FileWriter********************************");
		System.out.print("Enter the file content: "); 
		String na=sc2.next(); 

		g.ekteb(f2,na,append);
		System.out.println("***********************FileOutputStream********************************");
		System.out.print("Enter the file content: "); 
		String naa=sc2.next(); 
	    g.a9ra(f2);
	    g.ekteb2(f2, naa,append);   
	    g.a9ra(f2);
       sc2.close();  
          
	
	}
}
	


