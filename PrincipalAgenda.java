 import java.util.Scanner;
/**
 * @(#)PrincipalAgenda.java
 *
 * PrincipalAgenda application
 *
 * @author 
 * @version 1.00 2022/5/18
 */

public class PrincipalAgenda {
 public static void main(String[] args){
    
        Agenda objA= new Agenda();  
        	       
	    Contacto objC=new Contacto(); 
	    	  
    	 objC.setNombre("Alitzel"); 
         objC.setApellidos("Zamora");
         objC.setWhatsapp("74612456");
	     objC.setFacebook("Alitzel Zamora");
         objC.setIsBeca(true);
	     objC.setEdad(19);
		 objC.setCarrera("ISC"); 
		 objC.setPromedioEscolar(9.3f);
	 	 objC.setCorreoElectronico("Ali@zamora.com");
	 	 
   	   objA.AgregarContacto(objC);
   	  
   	   
	 	
	   Contacto objD=new Contacto();  
	  	 
    	objD.setNombre("Said Jair"); 
        objD.setApellidos("Jair");
        objD.setWhatsapp("7461986433");
	    objD.setFacebook("Said Jair");
        objD.setIsBeca(true);
	    objD.setEdad(39);
		objD.setCarrera("ISC"); 
		objD.setPromedioEscolar(9.1f);
	 	objD.setCorreoElectronico("Said@Jair.com");
	 	
      objA.AgregarContacto(objD);
	 
      Contacto objE=new Contacto();   
      
    	 objE.setNombre("Flor"); 
         objE.setApellidos("Ontiveros");
         objE.setWhatsapp("7423451083");
	     objE.setFacebook("Flor Ontiveros");
         objE.setIsBeca(true);
	     objE.setEdad(18);
		 objE.setCarrera("ISC"); 
		 objE.setPromedioEscolar(9.3f);
	 	 objE.setCorreoElectronico("Flor@Ontiveros.com");
	 	 
	 	objA.AgregarContacto(objE);	
	    
	    objA.MostrarLista();
	    
	    objA.ModificarContacto();
	    
	    objA.VaciarContactos();
	    
	    objA.EliminarContacto();
	    
	    objA.BuscarContacto();
	    
	    objA.EspaciosLibresAgenda();
	 	
 } 
	 	
	 }
