/**
 * @(#)Contacto.java
 *
 *
 * @author 
 * @version 1.00 2022/5/18
 */


public class Contacto {
	

    //atributos que tiene un contacto	
	private String Nombre=""; //OBLIGATORIO
	private String Apellidos=""; //OBLIGATORIO
	private String Whatsapp="";
	private String Facebook="";
	private Boolean IsBeca=false;
	private int Edad=0;
	private String Carrera; //OBLIGATORIO
	private float PromedioEscolar;
	private String CorreoElectronico;



    public Contacto(){
    }
    
    //hacemos uso del get y set para cada atributo de contactos
    
    public String getNombre(){
    	return this.Nombre;
    }
    public void setNombre(String Nombre){
    	this.Nombre=Nombre;
    }
    
    public String getApellidos(){
    	return this.Apellidos;
    }
    public void setApellidos(String Apellidos){
    	this.Apellidos=Apellidos;
    }
    
    public String getWhatsapp(){
    	return Whatsapp;
    }
    public void setWhatsapp(String Whatsapp){
    	this.Whatsapp=Whatsapp;
    }
    
    public String getFacebook(){
    	return Facebook;
    }
    public void setFacebook(String Facebook){
    	this.Facebook=Facebook;
    }
    
    public Boolean getIsBeca(){
    	return IsBeca;
    }
    public void setIsBeca(Boolean IsBeca){
    	this.IsBeca=IsBeca;
    }
    
    public int getEdad(){
    	return Edad;
    }
    public void setEdad(int Edad){
    	this.Edad=Edad;
    }
    
   public String getCarrera(){
    	return Carrera;
   }
   
   public void setCarrera(String Carrera){
   	this.Carrera=Carrera;
   }
 
   public float  getPromedioEscolar(){
   	return PromedioEscolar;
   }
   
   public void setPromedioEscolar(float PromedioEscolar){
   	this.PromedioEscolar=PromedioEscolar;
   }
   
   public String getCorreoElectronico(){
   	return CorreoElectronico;
   }
   
   public void setCorreoElectronico(String CorreoElectronico){
   	this.CorreoElectronico=CorreoElectronico;
   }
   

   
}
