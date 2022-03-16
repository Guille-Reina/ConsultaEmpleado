package Fichero;
import java.io.*;
import java.util.Scanner;


public class Insercion {

	
	public static void main(String[] args) throws IOException{
		File fichero = new File("AleatorioEmple.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        Scanner sc = new Scanner(System.in);

		int consulta;
		
			
		System.out.print("Ingrese la id nueva: ");
		consulta = sc.nextInt();
		

				
				if (consulta <= 7) {
					System.out.println("Exite esta id");	
					
					System.out.print("Ingrese el departamento modificado (1-50): ");
					int newdep = sc.nextInt();
								
					System.out.print("Ingrese el salario modificado(1-10.000): ");
					int newsalario = sc.nextInt();
				   		   		   
				   long posicion = (consulta -1 ) * 36; 
				   posicion=posicion+4+20; 
				   file.seek(posicion);  
				   file.writeInt(newdep);
				   file.writeDouble(newsalario);
				   file.close();
					
				}else {
					System.out.print("No exite esta id");				
				}
	}
}

