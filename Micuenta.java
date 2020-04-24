package ProyectoIngenieria;
import java.util.*;
public class Micuenta {

private DatosCliente datos;
private Administradortabla tabla;
private ArrayList<String> informacion=new ArrayList<String>();

public void Imprimir() {
	//String titulos[]=getmostrar();
	for(int i=0;i<informacion.size();i++){
		//System.out.println(titulos[i]+" :"+informacion.get(i));
	}
}

public void getmostrar() {
	String titulos[]= new String [8];
	String rutas="tableconvert_csv_0xo8do.csv";
String matriz[][]=tabla.getLectura_especial_clientes(rutas);

for(int i=0;i<matriz.length;i++) {
	for(int j=0;j<matriz[0].length;j++) {
		titulos[i]=matriz[0][j];
		System.out.println(titulos[i]+" :"+informacion.get(i));
	}
}

}


public ArrayList<String> getInformacion() {
	return informacion;
}

public void setInformacion(ArrayList<String> informacion) {
	this.informacion = informacion;
}

/*public void getmostrarDatos(DatosCliente datos) {
	
	System.out.println(" INFORMACION DEL CLIENTE\n");
	System.out.println("\u27A3 Nombre: " +datos.getNombre());
	System.out.println("\u27A3 Apellido: " +datos.getApellido());
	System.out.println("\u27A3 Dni: "+datos.getDni());
	System.out.println("\u27A3 Correo: "+datos.getCorreo());
	System.out.println("\u27A3 telefono: "+datos.getTelefono());
	System.out.println("\u27A3 Ciudad: "+datos.getCiudad());
	System.out.println("\u27A3 País: "+datos.getPais());
	System.out.println("\u27A3 C.P: "+datos.getCp());
}*/
public void setDatos() {
	String dato="";
	Scanner teclado = new Scanner(System.in);
	String nuevoNombre="";
	String nuevoApellido="";
	String nuevoDni="";
	String nuevoTelefono="";
	String nuevoCorreo="";
	String nuevoCp="";
	String nuevoCiudad="";
	String nuevoPais="";
	
	System.out.println("¿Que datos desea modificar");
	dato=teclado.nextLine();
	if(dato.equalsIgnoreCase("nombre")) {
		System.out.println("Digite el nuevo " +dato);
		nuevoNombre=teclado.nextLine();
		datos.setNombre(nuevoNombre);
		
	}
	else if(dato.equalsIgnoreCase("apellido")) {
		System.out.println("Digite el nuevo " +dato);
		nuevoApellido=teclado.nextLine();
		datos.setApellido(nuevoApellido);
		
	}
	else if(dato.equalsIgnoreCase("correo")) {
		System.out.println("Digite el nuevo " +dato);
		nuevoCorreo=teclado.nextLine();
		datos.setCorreo(nuevoCorreo);
		
	}
	else if(dato.equalsIgnoreCase("telefono")) {
		System.out.println("Digite el nuevo " +dato);
		nuevoTelefono=teclado.nextLine();
		int tel=Integer.parseInt(nuevoTelefono);
		datos.setTelefono(tel);
		
	}
	else if(dato.equalsIgnoreCase("cp")) {
		System.out.println("Digite el nuevo " +dato);
		nuevoCp=teclado.nextLine();
		int cpostal=Integer.parseInt(nuevoCp);
		datos.setCp(cpostal);
		
	}
	else {
		System.out.println("El dato que introdujo no es valido \u2718");
	}
	
}
}
