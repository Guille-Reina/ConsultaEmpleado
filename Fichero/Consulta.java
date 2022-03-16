package Fichero;
import java.io.*;
import java.util.Scanner;


public class Consulta {

	
	public static void main(String[] args) throws IOException{
		File fichero = new File("AleatorioEmple.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
        Scanner sc = new Scanner(System.in);

		
		int  id, dep, posicion;    
		Double salario;	
		char apellido[] = new char[10], aux;
		int consulta;
		
			
			System.out.print("Ingrese la id: ");
			consulta = sc.nextInt();
		
			try {
			
				posicion = 0;
				
				for(;;){
					file.seek(posicion);
					id = file.readInt();
					

					for (int i = 0; i < apellido.length; i++) {         
						aux = file.readChar(); 
						apellido[i] = aux;    
					}
		    
						String apellidos = new String(apellido); 
						dep = file.readInt();
						salario = file.readDouble();

						if(id >0)
	                        
						posicion= posicion + 36;	 
		      
						if (file.getFilePointer() == file.length());
						
						if (id == consulta) {
							System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n",
						        	id,   apellidos.trim(), dep, salario);							
							break;

						}
					}
			}catch (EOFException e) {
				System.out.println("No se ha encontrado a la persona");
			}
		   
			file.close();

	}
}
