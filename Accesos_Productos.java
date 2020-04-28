package ProyectoIngenieria;

import java.text.DecimalFormat;
import java.util.*;

public class Accesos_Productos {
	private Administradortabla tablaconfigurador;
	private String matriz[][];
	private final String ruta = "tableconvert_csv_8oqpav.csv";
	private String articulo;
	private String seccion;

	private String descripcion;
	private String cajas;
	private String unidades;
	private String precio_in;
	private String precio_out;
	private String fecha_in;
	private String fecha_out;
	private String iva;

	public Accesos_Productos(Administradortabla tablaconfigurador) {
		super();
		this.descripcion = descripcion;
		this.articulo = articulo;
		this.seccion = seccion;
		this.cajas = cajas;
		this.unidades = unidades;
		this.precio_in = precio_in;
		this.precio_out = precio_out;
		this.fecha_in = fecha_in;
		this.fecha_out = fecha_out;
		this.iva = iva;
		this.articulo = articulo;
		this.matriz = tablaconfigurador.getlectura_csv(ruta);
		this.tablaconfigurador = tablaconfigurador;
	}

	public String[][] getIncrementarPrecio() {

		int[][] matrizcajas = new int[this.matriz.length][this.matriz[0].length];
		double matrizPreciout = 0.00;
		String preciofinal = "";
		for (int i = 0; i < this.matriz.length; i++) {
			// Cuestion importante me aparecia todo en null y lo que hice fue declarar
			// afuera this.matris =.. y funciono
			if (matriz[i][0].equals("Agua")) {

				matrizcajas[i][3] = Integer.parseInt(matriz[i][3]);
				// Si alguna caja es menor que 6
				if (matrizcajas[i][3] < 6) {
					// pasamos la matriz en la posicion de precios a doubles
					matrizPreciout = Double.parseDouble(matriz[i][6]);
					// Asigno cuanto hay que aumentarle de precio
					matrizPreciout = matrizPreciout + 0.50;
					// cambio ese precio modificado a string
					preciofinal = String.valueOf(matrizPreciout);
					// le digo a la matriz que el valor devuelto va a ser el nuevo valor
					this.matriz[i][6] = preciofinal;

					// modificamos el fichero
					tablaconfigurador.getescribirenFichero(ruta, this.matriz);
				}
			}
		}
		return matriz;
	}

	// IMPORTANTE SOLO BAJA EL AGUA
	// Averiguar como reducirlo con una formula, es decir que no sean 50c
	public String[][] getBajarPrecio() {

		int[][] matrizcajas = new int[this.matriz.length][this.matriz[0].length];
		double matrizPreciout = 0.00;
		String preciofinal = "";
		for (int i = 0; i < this.matriz.length; i++) {
			// Cuestion importante me aparecia todo en null y lo que hice fue declarar
			// afuera this.matris =.. y funciono
			if (matriz[i][0].equals("Agua")) {

				matrizcajas[i][3] = Integer.parseInt(matriz[i][3]);
				// Si alguna caja es mayor que 40
				if (matrizcajas[i][3] > 40) {
					// pasamos la matriz en la posicion de precios a doubles
					matrizPreciout = Double.parseDouble(matriz[i][6]);
					// Asigno cuanto hay que disminuirle de precio

					matrizPreciout = matrizPreciout - 0.50;
					// cambio ese precio modificado a string

					// Le agrego una funcion para que me baje la cantidad de decimales
					preciofinal = String.valueOf(String.format("%.2f", matrizPreciout));
					// le digo a la matriz que el valor devuelto va a ser el nuevo valor
					this.matriz[i][6] = preciofinal;
					// modificamos el fichero
					tablaconfigurador.getescribirenFichero(ruta, this.matriz);
				}
			}
		}
		return matriz;
	}

	// Lo hacemos por demanda?? que cuando sea poco solicitado sugerir modificarlo
	public String[][] getModificarProducto() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("\n\u2750 ¿ Que producto desea cambiar? :");
		articulo = teclado.nextLine();
		int posicion = 0;
		boolean encontrado = false;
		// RECORDAR QUE HAY QUE VALIDAR LA FECHA SI ESTA EN EL FORMATO QUE QUIERO
		for (int i = 0; i < matriz.length; i++) {

			// en la nueva va la anterior
			if (matriz[i][1].equals(articulo)) {
				encontrado = true;

				// Me guardo la posicion para utilizarla luego
				posicion = i;
			}
			else {
				encontrado=false;
			}

		}
		if (encontrado == true) {
			System.out.println("\n Producto Validado \u2714 \n");
			// saco la posicion y cambio sus valores
			// CUESTION: AÑADE EN LA SECCION DEL ARTICULO, SIN E
			// matriz[posicion][0] = this.seccion;
			System.out.print(" \u2750 Articulo: ");
			this.articulo = teclado.nextLine();
			matriz[posicion][1] = this.articulo;
			System.out.print(" \u2750 Descripcion: ");
			this.descripcion = teclado.nextLine();
			matriz[posicion][2] = this.descripcion;
			System.out.print(" \u2750 Cajas: ");
			this.cajas = teclado.nextLine();
			matriz[posicion][3] = this.cajas;
			System.out.print(" \u2750 Unidades: ");
			this.unidades = teclado.nextLine();
			matriz[posicion][4] = this.unidades;
			System.out.print(" \u2750 Precio_in: ");
			this.precio_in = teclado.nextLine();
			matriz[posicion][5] = this.precio_in;
			System.out.print(" \u2750 Precio_out: ");
			this.precio_out = teclado.nextLine();
			matriz[posicion][6] = this.precio_out;
			System.out.print(" \u2750 I.V.A: ");
			iva = teclado.nextLine();
			matriz[posicion][7] = this.iva + "%";
			System.out.print(" \u2750 Fecha_in: ");
			this.fecha_in = teclado.nextLine();
			matriz[posicion][8] = this.fecha_in;
			System.out.print(" \u2750 Fecha_out: ");
			this.fecha_out = teclado.nextLine();
			matriz[posicion][9] = this.fecha_out;

			tablaconfigurador.getescribirenFichero(ruta, this.matriz);
		} else if (encontrado == false) {
			System.out.println("\nEl producto no se encuentra dentro del fichero \u2717\n");

		}

		// cuando se guarde le voy a añadir otra posicion nueva
		return matriz;
	}
}
