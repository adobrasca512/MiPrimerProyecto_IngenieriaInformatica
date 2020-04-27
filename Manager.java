package ProyectoIngenieria;

import java.util.Scanner;

public class Manager {
	private Administradortabla tablaconfiguracion;
	private Vcrearcuenta crearcuenta;
	private String matriz[][];
	private String matrizC[][];
	private int subdesicion;
	private int desicion;
	private final String ruta = "tableconvert_csv_8oqpav.csv";
	private final String rutaC = "tableconvert_csv_0xo8do.csv";
	private DatosCliente clientesinfo;

	public Manager(int desicion, int subdesicion) {

		this.tablaconfiguracion = new Administradortabla();
		this.crearcuenta = new Vcrearcuenta();
		this.matriz = tablaconfiguracion.getlectura_csv(ruta);
		this.matrizC = tablaconfiguracion.getlectura_csv(rutaC);
		// this.clientesinfo= new
		// DatosCliente(crearcuenta.getNombres(),crearcuenta.getApellidos(),crearcuenta.getCorreos(),
		// crearcuenta.getPaises(), crearcuenta.getCiudades(),crearcuenta.getTelefonos()
		// , crearcuenta.getCp(), crearcuenta.getIdentificacion());

	}

	public void getManagerMenu() {

		// String[][] matrizA=tablaconfiguracion.getLectura_especial_almacen(ruta);;

		Scanner teclado = new Scanner(System.in);
		Estadisticas estadisticas = new Estadisticas(this.tablaconfiguracion, this.matriz);

		Quejas_Clientes quejas = new Quejas_Clientes(tablaconfiguracion);

		Accesos_Productos accessproductos = new Accesos_Productos(tablaconfiguracion);

		while (desicion != 7) {
			System.out.println("\t\tBienvenido a la plataforma de Gestionamiento de la empresa: (Nombre)\n\n"
					+ "1. Acceder a datos" + "\n\n2. Verificar capacidad de almacenamiento"
					+ "\n\n3. Estadisticas de demanda" + "\n\n4. Accesos por producto"
					+ "\n\n5.Informacion del cliente");

			System.out.print("\n \u270E Respuesta: ");

			desicion = teclado.nextInt();

			switch (desicion) {
			case 1:

				getAccederdatos(subdesicion);

				break;
			case 2:
				estadisticas.getCapacidadAlmacenamiento();
				break;
			case 3:
				accessproductos.getIncrementarPrecio();
				accessproductos.getBajarPrecio();
				break;
			case 4:
				accessproductos.getModificarProducto();
				break;
			case 5:
				quejas.getLeerquejas();
				break;
				// Preguntarle al profesor si el usuario puede salir cuando le de la gana
			default:
				System.out.println("El valor introducido no es valido");
				break;
			}

		}

		System.out.println("\n¡Hasta luego!");

	}

	public void getAccederdatos(int subdesicion) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("\t1. Visualizar Datos de Almacenamiento. " + "\n\n\t2. Visualizar Datos de Clientes.");
		System.out.print("\n \u270E Respuesta: ");
		if (teclado.hasNextInt()) {
			subdesicion = teclado.nextInt();
			switch (subdesicion) {
			case 1:
				System.out.println("\n\n ALMACEN:\n");
				tablaconfiguracion.getPintarMatriz(matriz);
				break;
			case 2:
				System.out.println("\n\n CLIENTES: ");
				tablaconfiguracion.getPintarMatriz(matrizC);
				break;
			}

		} else {
			System.out.println("Respuesta no valida. \ud83d\udeab");
		}

	}
}
