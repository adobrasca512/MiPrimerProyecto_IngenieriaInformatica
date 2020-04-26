package ProyectoIngenieria;

public class Quejas_Clientes {
	private Administradortabla tablaconfigurador;
	private String matriz[][]= new String [30][2];
	private final String ruta="quejas-clientes.txt";
    private Comprascliente compras;
	public Quejas_Clientes(Administradortabla tablaconfigurador) {
		super();
		this.tablaconfigurador = tablaconfigurador;
		this.matriz = matriz;
	}

	public void getLeerquejas() {
		System.out.println("Quejas de Clientes \n");
	
	
	tablaconfigurador.getPintarMatriz(tablaconfigurador.getlectura_csv(this.ruta));
}
}
