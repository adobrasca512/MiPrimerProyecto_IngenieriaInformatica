package ProyectoIngenieria;

public class Quejas_Clientes {
	private Administradortabla tablaconfigurador;
	private String matriz[][];
	private final String ruta = "quejas-clientes.txt";
	private Comprascliente compras;

	public Quejas_Clientes(Administradortabla tablaconfigurador) {
		super();
		this.tablaconfigurador = tablaconfigurador;
		this.matriz = matriz;
	}

	public void getLeerquejas() {
		System.out.println("\nQuejas de Clientes \n");

		System.out.println("---------------------------------------\n");
		tablaconfigurador.getPintarMatriz(tablaconfigurador.getlectura_csv(this.ruta));
	}
}
