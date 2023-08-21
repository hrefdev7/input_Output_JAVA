package creationFichier;

	 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 

public class ReaderWriter {
	
	 
	 public void ekteb2(File f,String j,boolean append) throws IOException {
		 
		//******************************************Java FileOutputStream  CREER UN FLUX DE DONNEE VERS UN FICHIER*********************************************************
			 /*
			  * //Scanner sc=new Scanner(System.in);  
			  */
			 
			  //	System.out.print("Enter the file name: ");  
			//String name=sc.nextLine();  
			      
			 //object of Scanner class   
			
			//variable name to store the file name  
			FileOutputStream fos=new FileOutputStream(f,append);  // true for append mode 
			//ajouter stream sans effacer le contenu true et si on veut tt effacer false
			
			
			      //str stores the string which we have entered  
			byte[] b= j.getBytes();
			//converts string into bytes  
			fos.write(b);           //writes bytes into file  
			fos.close();            //close the file  
			System.out.println("file saved."); 
			

		
			
	}
	 
	public void ekteb(File f,String g,boolean append) throws Exception {
		  /*
	     *  on peut utiliser la classe FileWriter. Elle permet également d'ajouter du texte à la fin du fichier, 
	     *  sans ouvrir et fermer celui-ci à chaque appel. Il faut pour cela indiquer le booléen true en deuxième
	     *   paramètre lors de la création de l'instance.
	     */
    FileWriter fw = new FileWriter(f,append); 
      //appends the string to the file
    
      fw.append(g);
      fw.close();   
      
	}
	
	
	public void a9ra(File f) {
		try   
        { 
		 BufferedReader br = new BufferedReader(new FileReader(f));
	     //read the fmile content
	    
	     String strCurrentLine;
	     while ((strCurrentLine = br.readLine()) != null) {
	       System.out.println(strCurrentLine);
	     }
	     br.close();                         
	   }
	   catch(Exception ioe)
	   {
	    System.err.println("IOException: " + ioe.getMessage());
	   }}
	
		
	
	public  File createfile(String name) {
	
        
    
 
        File f2 = new File(name); //initialize File object and passing path as argument  
        boolean result;  
        try   
        {  
        result = f2.createNewFile();  //creates a new file  with methode createnewfile
        if(result)      // test if successfully created a new file  
        {  
        System.out.println("file created "+f2.getCanonicalPath()); //returns the path string  
        }  
        else  
        {  
        System.out.println("File already exist at location: "+f2.getCanonicalPath());  
        }  
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();    //prints exception if any  
        }       
       //fermeture du scaner
        
        System.out.println("*************************************************");
             
   
        return f2;
        }
	

}
