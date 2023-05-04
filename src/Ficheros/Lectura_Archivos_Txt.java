package Ficheros;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura_Archivos_Txt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File fichero = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	    	  
	    	 fichero = new File ("C:\\Users\\ivan\\Escritorio\\Fichero.txt");
	         fr = new FileReader (fichero);
	         br = new BufferedReader(fr);

	         String linea;
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	         }
	         
	      }/*catch(Exception e) {
	    	  
	      }*/			
	      catch(FileNotFoundException fnfe){
			  System.out.print("[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" +
			  fnfe); 
	      }catch(IOException ioe){
			  System.out.print("[ERROR] - ERROR AL LEER LINEA: " + ioe); 
	      }finally{ //Siempre va a ejecutarse, aunque se ejecute lo de dentro de un catch o lo de dentro del try
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (IOException ioe2){ 
	        	 System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
	         }
	      }
	}

}
