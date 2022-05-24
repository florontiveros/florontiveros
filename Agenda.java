 /**
 * @(#)Agenda.java
 *
 *
 * @author 
 * @version 1.00 2022/5/18  
 */


public class Agenda {
	
	
	 Contacto[] arrAgenda;

	public Agenda () {
		arrAgenda= new Contacto[20];
	}

	public Agenda(int tamanio){

   		//this.arrAgenda = new Contacto [tamanio];

	}
	
	public void AgregarContacto (Contacto C){			
		//System.out.println("Metodo AgregarContacto "+ arrAgenda.length);				
		for(int i=0;i<arrAgenda.length;i++){
			
			if(arrAgenda[i] == null ){
				arrAgenda[i]=C;
				//System.out.println("Realizo la asignación");
				break;
			}
		}	
			
	}
	
	public void MostrarLista(){
			
		for(int i=0;i<arrAgenda.length;i++){	
			if(arrAgenda[i] != null ){					
				System.out.println("Nombre" + arrAgenda[i].getNombre() + " Apellido " + arrAgenda[i].getApellidos() +  " correo "+  arrAgenda[i].getCorreoElectronico()+ " Carrera " + arrAgenda[i].getCarrera()
					+" Edad" + arrAgenda[i].getEdad() + " PromedioEscolar " + arrAgenda[i].getPromedioEscolar() + " IsBeca " + arrAgenda[i].getIsBeca()
						+ " Whatsapp " + arrAgenda[i].getWhatsapp() + " Facebook " + arrAgenda[i].getFacebook());
						
			}
		}
	}
		
		
		public void ModificarContacto(){
			
			for(int i=0; i<arrAgenda.length;i++){
				
				if(arrAgenda[i] !=null){
					System.out.println("Modificar contacto" + arrAgenda[i].getNombre());
				}
					
			}
		}
		
		   public void VaciarContactos(){
		   	
		   	for(int i=0; i<arrAgenda.length;i++){
		   		if(arrAgenda[i] !=null){
		   			System.out.println("Vaciar contacto" + arrAgenda[i].getWhatsapp());
		   			
		   	  }
		   	}
		   }
		   
		   public void EliminarContacto(){
		   	 for(int i=0; i<arrAgenda.length;i++){
		   	 	if(arrAgenda[i] !=null){
		   	 		System.out.println("Eliminar contactos" + arrAgenda[i].getNombre() + arrAgenda[i].getApellidos());
		   	 	}
              }
            }
            
            public void BuscarContacto(){
            	for(int i=0;i<arrAgenda.length; i++){
            		if(arrAgenda[i] !=null){
            			System.out.println("Nombre " +  arrAgenda[i].getNombre());
            		}
                }
            }
            
            public void EspaciosLibresAgenda(){
            	for(int i=0;i<arrAgenda.length; i++){
            		if(arrAgenda[i] !=null){
            			System.out.println("Espacios libres" + arrAgenda[i] + (""));
            		}
            	}
            }
            	
   	
}

	







   		
   		
   		
