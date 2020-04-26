package ProyectoIngenieria;

public class Estadisticas {
private Administradortabla tablaconfigurador;
private String matriz[][]= new String [48][10];
private final String ruta="tableconvert_csv_8oqpav.csv";



public Estadisticas(Administradortabla tablaconfigurador, String[][] matriz) {
	super();
	this.tablaconfigurador = tablaconfigurador;
	this.matriz = matriz;
}



public void getCapacidadAlmacenamiento() {
	
	String matriz[][]=tablaconfigurador.getLectura_especial_almacen(ruta);
	//Hay que poner solo la fila 3 en vez de todas las columnas
	double matrizcajas[][]= new double [this.matriz.length][this.matriz[0].length];
	double sumaA=0;
	double sumaAD=0;
	double sumaAF=0;
	double sumaBG=0;
	double sumaBI=0;
	double sumaBE=0;
	
		for (int i = 1; i < matrizcajas.length; i++) {
			
				if(matriz[i][0].equals("Agua")) {
					 matrizcajas[i][3]=Double.parseDouble(matriz[i][3]);
					 	
					 sumaA=matrizcajas[i][3]+sumaA;
					
				
			}
				if(matriz[i][0].equals("Bebidas Alcoholicas Destiladas")) {
					matrizcajas[i][3]=Double.parseDouble(matriz[i][3]);
				 	
					 sumaAD=matrizcajas[i][3]+sumaAD;
					
				
				}
			if(matriz[i][0].equals("Bebidas Alcoholicas Fermentadas")) {
				matrizcajas[i][3]=Double.parseDouble(matriz[i][3]);
			 	
				 sumaAF=matrizcajas[i][3]+sumaAF;
				
				}
				if(matriz[i][0].equals("Bebidas Gaseosas")) {
					matrizcajas[i][3]=Double.parseDouble(matriz[i][3]);
				 	
					 sumaBG=matrizcajas[i][3]+sumaBG;
					
				}
				//ajrrr
				 if(matriz[i][0].equals("Bebidas Isotonicas")) {
					 matrizcajas[i][3]=Double.parseDouble(matriz[i][3]);
					 	
					 sumaBI=matrizcajas[i][3]+sumaBI;
					
				
				}
				else if(matriz[i][0].equals("Bebidas Energeticas")) {
					matrizcajas[i][3]=Double.parseDouble(matriz[i][3]);
				 	
					 sumaBE=matrizcajas[i][3]+sumaBE;
					
				
				}
		}
		//Duda el almacenamiento se hara por cajas?
		System.out.println("\t\t******* PORCENTAJE DE ALMACENAMIENTO (capacidad maxima: 800 cajas) *******\n");
		System.out.println("\u272F Agua posee: "+(sumaA/800)*100 +"%" +" del Almacenamiento.\n");
		System.out.println("\u272F Bebidas Alcoholicas Fermentadas posee: "+(sumaAF/800)*100 +"%"+" del Almacenamiento.\n");
		System.out.println("\u272F Bebidas Alcoholicas Destiladas posee: "+(sumaAD/800)*100 +"%"+" del Almacenamiento.\n");
		System.out.println("\u272F Bebidas Isotónicas posee: "+(sumaBI/800)*100 +"%"+" del Almacenamiento.\n");
		System.out.println("\u272F Bebidas Gaseosas posee: "+(sumaBG/800)*100 +"%"+" del Almacenamiento.\n");
		System.out.println("\u272F Bebidas Energéticas posee: "+(sumaBE/800)*100 +"%"+" del Almacenamiento.\n");
		//Se podra usar el polimorfismo??
		/* if(matriz[i][0].equals("Bebidas Alcoholicas Destiladas")) {
			 matrizcajas[i][3]=Integer.parseInt(matriz[i][3]);
			 int suma=0;	
			 suma=matrizcajas[i][3]+suma;
			 System.out.println((suma/800)*100);
		
		}
		else if(matriz[i][0].equals("Bebidas Alcoholicas Fermentadas")) {
			 matrizcajas[i][3]=Integer.parseInt(matriz[i][3]);
			 int suma=0;	
			 suma=matrizcajas[i][3]+suma;
			 System.out.println((suma/800)*100);
		
		}
		else if(matriz[i][0].equals("Bebidas Gaseosas")) {
			 matrizcajas[i][3]=Integer.parseInt(matriz[i][3]);
			 int suma=0;	
			 suma=matrizcajas[i][3]+suma;
			 System.out.println((suma/800)*100);
		
		}
		//ajrrr
		else if(matriz[i][0].equals("Bebidas Isotonicas")) {
			 matrizcajas[i][3]=Integer.parseInt(matriz[i][3]);
			 int suma=0;	
			 suma=matrizcajas[i][3]+suma;
			 System.out.println((suma/800)*100);
		
		}
		else if(matriz[i][0].equals("Bebidas Energeticas")) {
			 matrizcajas[i][3]=Integer.parseInt(matriz[i][3]);
			 int suma=0;	
			 suma=matrizcajas[i][3]+suma;
			 System.out.println((suma/800)*100);
		
		}

		
		
	}*/
}
}
