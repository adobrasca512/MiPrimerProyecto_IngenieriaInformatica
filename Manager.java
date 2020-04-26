package ProyectoIngenieria;

import java.util.Scanner;

public class Manager {
	private Administradortabla tablaconfiguracion;
	
	private String matriz[][];
			private int desicion;
			private final String ruta=  "tableconvert_csv_8oqpav.csv";

  public Manager(int desicion,Administradortabla tablaconfiguracion) {
		super();
		
		
		this.matriz=tablaconfiguracion.getLectura_especial_almacen(ruta);
	
		
		this.tablaconfiguracion = tablaconfiguracion;
	    
	}

	public void getManagerMenu() {
		
		// String[][] matrizA=tablaconfiguracion.getLectura_especial_almacen(ruta);;
		
		
		Scanner teclado = new Scanner(System.in);
		Estadisticas estadisticas = new Estadisticas(this.tablaconfiguracion,this.matriz);

		Quejas_Clientes quejas = new Quejas_Clientes(tablaconfiguracion);

		Accesos_Productos accessproductos = new Accesos_Productos(tablaconfiguracion);

		System.out.println("\t\tBienvenido a la plataforma de Gestionamiento de la empresa: (Nombre)\n\n"
				+ "\n\n1. Verificar capacidad de almacenamiento" + "\n\n2. Estadisticas de demanda"
				+ "\n\n3. Accesos por producto" + "\n\n4.Informacion del cliente");
		
			
			while(desicion!=5) {
				desicion=teclado.nextInt();
				switch (desicion) {
				case 1:
					estadisticas.getCapacidadAlmacenamiento();
					break;
				case 2:
					accessproductos.getIncrementarPrecio();
					accessproductos.getBajarPrecio();
					break;
				case 3:
					accessproductos.getModificarProducto();
					break;
				case 4:
					quejas.getLeerquejas();
					break;
				}
			
			
			
		}
		

	}
}
