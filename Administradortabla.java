package ProyectoIngenieria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Administradortabla {
	


	

	
	

	//mejorar
	public String [][] getlectura_csv(String rutas,int filas, int columnas) {
		
		//esto leera ambos csv en donde se heredara esta clase y tomara de parametros los propios de las clases 
		//El tamaño de fila de el csv almacenamiento es de 48 y columnas 9
		String [][]matriz=  new String [filas][columnas];
		
		File file = new File(rutas);
		String data="";
		try {
			Scanner reader = new Scanner(file);
			int i=0;
			while(reader.hasNextLine()) {
				data= reader.nextLine();
				matriz[i]=data.split(";");
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		return matriz;
	}
	public void getPintarMatriz(String [][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[0][j]+matriz [i][j] +"\n");
			}
			System.out.println("---------------------------------------");
		}
		//Hay que acomodarlo para que quede bien
	}
	public void getLectura_y_Pinturaalmacen(String ruta) {
		
		int filas = 48;
		int columnas = 10;
		String[][] matriz = getlectura_csv(ruta, filas, columnas);
		getPintarMatriz(matriz);
		
	}
	public String[][] getLectura_especial_almacen(String ruta) {
		 
		int filas = 48;
		int columnas = 10;
		String[][] matriz = getlectura_csv(ruta, filas, columnas);
		return matriz;
	}

	public void  getLectura_y_Pinturaclientes() {
		String rutas="tableconvert_csv_0xo8do.csv";
		int filas = 16;
		int columnas = 8;
		String[][] matriz = getlectura_csv(rutas, filas, columnas);
		getPintarMatriz(matriz);
		
	}
	public String[][] getLectura_especial_clientes(String ruta) {
		
		int filas = 16;
		int columnas = 8;
		String[][] matriz = getlectura_csv(ruta, filas, columnas);
		return matriz;
	}
	public static void getescribirenFichero(String ruta, String[][] Matriz) {
		try {
			FileWriter fichero = new FileWriter(ruta);
			// Escribimos linea a linea en el fichero
			for (int i = 0; i < Matriz.length; i++) {
				for (int j = 0; j < Matriz[0].length; j++) {
					fichero.write(Matriz[i][j] + ";");
				}
				fichero.write("\n");
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}


	
	


}
