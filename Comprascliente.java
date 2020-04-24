package ProyectoIngenieria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Comprascliente  {
private Administradortabla tablacliente;
private String seccion;
private String articulo;
private int subdesicion;
private ArrayList<String>carrito;
private ArrayList<Double>carritoprecio;
private int desicion;
private String matriz[][];
private String rutas;
private ArrayList<Integer> posicionesCompradas;



	public Comprascliente(Administradortabla tablacliente, String seccion, String articulo, int subdesicion, int desicion,
		String[][] matriz,String rutas) {
	super();
	this.posicionesCompradas=posicionesCompradas;
	this.rutas=rutas;
	this.tablacliente = tablacliente;
	this.seccion = seccion;
	this.articulo = articulo;
	this.subdesicion = subdesicion;
	this.desicion = desicion;
	this.matriz = matriz;
	posicionesCompradas=new ArrayList<Integer>();
	carritoprecio=new ArrayList<Double>();
	carrito= new ArrayList<String>();
}



	


	public String[][] getMatriz() {
		return matriz;
	}






	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}






	public int getDesicion() {
		return desicion;
	}



	public void setDesicion(int desicion) {
		this.desicion = desicion;
	}



	public void Menu_Clientes(int desicion,String [][]matriz) {
		Scanner teclado = new Scanner(System.in);
		
		while (desicion != 10 ) {
//[sodas-2-10%]String posicion= matriz[i][j]
			System.out.println("\t\tBienvenido a la pagina de compras Juice Delicio S.A"
                    +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
					+ "\n\ud83d\udc64 1. Mi cuenta\n"
					+ "\n   \uD83D\uDC5C 2. Compras\n" 
					+ "\n   \ud83d\udcb8 3. Devoluciones\n"
					+ "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.print("Respuesta: ");
			
			// Change to switch
			int subdesicion = 0;
			
				desicion = teclado.nextInt();
				switch (desicion){
				case 1:
					
					break;
				case 2:
					Comprar(subdesicion, matriz);
					break;
				case 3:
					break;
					default:
						System.out.println("Valor no válido! \ud83d\udeab");
						break;
				//}
			}
				
			
			
		

		}
		
		

	}
	
	

	// Esta funcion me muesta las cosas por seccion
	public void Comprar(int subdesicion,String [][]matriz) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1.Visualisacion total de productos"+"\n2.Comprar por categoria" + "\n3. or Articulo");
		subdesicion = teclado.nextInt();
		switch (subdesicion) {
		case 1:
			
			
			tablacliente.getPintarMatriz(this.matriz);
			break;
		case 2:
			Porcategoria(this.seccion, matriz);
		case 3:
			porArticulo(articulo, matriz);
			break;
		default:
			System.out.println("Seccion aun no disponible");
			break;
		}
		
	
	}

	public String[][] Porcategoria(String seccion,String [][]matrizseccion) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que categoria deseas visualizar?");// Decir esto mas formal
		System.out.println(
				"[Agua-Bebidas Alcoholicas-Bebidas Isotonicas-Bebidas Gaseosas-Bebidas Energeticas-Bebidas estimulantes]");
		seccion = teclado.nextLine();
		
		for (int i = 0; i < matrizseccion.length; i++) {
			for (int j = 0; j < matrizseccion[0].length; j++) {

				if (matrizseccion[i][0].equals(seccion)) {

					System.out.print(matrizseccion[0][j] + " : " + matrizseccion[i][j] + "\n");

				}

			}
			// Hay que arreglar esto
			if (matrizseccion[i][0].equals(seccion)) {
				System.out.println("-------------------------------------------");
			}

		}
		// Esto molesta? creo que sera util luego ya que tendria las cosas separadas por
		// seccion
		return matrizseccion;
	}

	public void porArticulo(String articulo,String [][]matrizArticulo) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que articulo desea comprar?");
		articulo = teclado.nextLine();
		String producto = "";
		double porcentaje;
		double precio;
		double precios = 0;
		int posicionreducir=0;
		System.out.print("---------------------------------------");
		for (int i = 0; i < matrizArticulo.length; i++) {
			for (int j = 0; j < matrizArticulo[0].length; j++) {
			
			if (matrizArticulo[i][1].equals(articulo)) {
				
				if(j<2) {
					System.out.print("\n"+matrizArticulo[0][j] +": "+ matrizArticulo[i][j] + "\n");
					
				 producto=matrizArticulo[i][1];
				System.out.println("producto"+producto);
				}
				if(j>5 && j<8) {
					System.out.print("\n"+matrizArticulo[0][j]+": " + matrizArticulo[i][j] + "\n");
					//Precio
					 precio= Double.parseDouble(matrizArticulo[i][6]);
					
					//Porcentaje
					String cadena=matrizArticulo[i][7];
					//Aqui quito el simbolo de porcentaje
					String quitar=cadena.substring(0,3);
				 porcentaje= Double.parseDouble(quitar);
				System.out.println("el porcent " +porcentaje);
					precios=precio+(porcentaje/100);
					
				}
				
				
				// caja = 3 3
				posicionreducir=i;
				}
			
		
			}
			
		}
		Compras(producto, precios);
		//Cuestion: no solo tiene que reducir los valores que inserte sino los valores que esten dentro del arraylist
		//Opcion: [Veri,Aguadoy,Dasani]-->Arraylist-->me hago un arraylist con sus posiciones [2-3-5-7]
		//recorro el arraylist y le digo que en las posiciones Arraylist.get(i) le resto 1
		//¿Necesitare poner el arraylist como parametro?--> Creo que no--> me creare una funcion que añada valores en el array
		
		//Actualizacion revisar
		//posicionesCompradas.add(posicionreducir);
		tablacliente.getPintarMatriz(getrestarCajas(matrizArticulo,posicionreducir));
		tablacliente.getescribirenFichero(rutas, getrestarCajas(matrizArticulo,posicionreducir));
		//Compras(producto, precio);
		System.out.print("---------------------------------------\n");
		
	}
public void getActualizaralmacen(){
   
	for(int i=0;i<matriz.length;i++) {
		for(int j=0;j<matriz[0].length;j++) {
		
		}
	}
	
	
	
}
public void Compras(String producto, double precios) {
 carrito.add(producto);
 carritoprecio.add(precios);
 for(int i=0;i<carrito.size();i++) {
	 System.out.println("Ha insertado el producto: " +carrito.get(i));
 }
 for(int j=0;j<carritoprecio.size();j++) {
	 System.out.println("Con un total de " +carritoprecio.get(j));
 }
}

/*public String [][] getrestarCajas(String [][] matriz,int posicionesCompradas){
String matrizNueva[][] = new String[matriz.length][10];

int posicionnueva=0;
String nuevototalcajas="";
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			// en la nueva va la anterior
			for(int k=0;k<posicionesCompradas.size();i++) {
				
			
			int cajas=Integer.parseInt(matriz[posicionesCompradas.get(k)][3]);
			//cajas 3
			//cajas 3-1 --> cajas=2
			//numero= 2-->String
			//matriz[posicion][3]==numero
			
			cajas=cajas-1;
			 nuevototalcajas=String.valueOf(cajas);
			 matrizNueva[posicionesCompradas.get(k)][3] = nuevototalcajas;
			matrizNueva[i][j] = matriz[i][j];
			}
		}
	}
	//numero= 2-->String Valueof(
	//matriznueva[filas][columnas]=numero
	
	 
	return matrizNueva;
	
	
	
}*/
public String [][] getrestarCajas(String [][] matriz,int posicion){
String matrizNueva[][] = new String[matriz.length][10];

int posicionnueva=0;
String nuevototalcajas="";
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			// en la nueva va la anterior
			int cajas=Integer.parseInt(matriz[posicion][3]);
			//cajas 3
			//cajas 3-1 --> cajas=2
			//numero= 2-->String
			//matriz[posicion][3]==numero
			
			cajas=cajas-1;
			 nuevototalcajas=String.valueOf(cajas);
			
			matrizNueva[i][j] = matriz[i][j];
		}
	}
	//numero= 2-->String Valueof(
	//matriznueva[filas][columnas]=numero
	 matrizNueva[posicion][3] = nuevototalcajas;
	 
	return matrizNueva;
	
	
	
}

	

	

	

}