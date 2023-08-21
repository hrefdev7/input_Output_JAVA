package ioTest;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
//The Java compiler or JVM looks for the main method when it starts executing a Java program
/*
 * The execution of the Java program, the java.exe is called. The Java.exe in turn makes 
 * Java Native Interface or JNI calls, and they load the JVM. The java.exe parses the command line,
 *  generates a new String array, and invokes the main() method	
 */
	public static void main(String[] args) {
		
		System.out.println("***************Filtrer .txt dans F:**********************************");
		 File file = new File("F:\\");
		 String[] list = file.list(new FilenameFilter() {
	           @Override
	            public boolean accept(File dir, String name) {
	        	   String sr=".txt";
	             if(name.toLowerCase().endsWith(sr)){

	                    return true;

	                }
	             else {

	                    return false;
	                }
	            }
	        });
	        for(String f:list){
	            System.out.println(f);
	        }
	
	//*****************************************************************************************************
	        
	System.out.println("********************recherche nom fichier ou repertoire dans F:*****************************");
	        // Create a File object 
	//The Scanner class is used to get user input,
	Scanner sc=new Scanner(System.in);
	  System.out.print("Entrer le nom de fichier avec son l'extension ");  
      String h=sc.next(); //reads string before the space  

	String fichier=h;
	        File my_file_dir = new File(fichier);
	         if (my_file_dir.exists()) 
	           {//Tests whether the file or directory denoted by this abstract pathname exists.

	            System.out.println("The file by this abstract pathname -> "+fichier+"  exists.\n");
	           } 
	         else
	          {
	            System.out.println("The The file by this abstract pathname  -> "+fichier+" does not exist.\n");
	            
	          }
	      
	         sc.close();   
	}
	
}


