package ProyectoIngenieria;
import java.io.FileWriter;
import java.util.*;
public class DatosCliente {
private String matriz[][];
private String nombre;
private String apellido;
private String correo;
private String pais;
private String ciudad;
private int telefono;
private int cp;
private String dni;
private String nusuario;
private String contrasena;
private Administradortabla usuario;
public DatosCliente(String nombre, String apellido, String correo, String pais, String ciudad, int telefono, int cp,
		String dni) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.pais = pais;
	this.ciudad = ciudad;
	this.telefono = telefono;
	this.cp = cp;
	this.dni = dni;
	

}

public String getNusuario() {
	return nusuario;
}

public void setNusuario(String nusuario) {
	this.nusuario = nusuario;
}

public String getContrasena() {
	return contrasena;
}

public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}

public void getmostrarDatos() {
	
	System.out.println(" INFORMACION DEL CLIENTE\n");
	System.out.println("\u27A3 Nombre: " +nombre);
	System.out.println("\u27A3 Apellido: " +apellido);
	System.out.println("\u27A3 Dni: "+dni);
	System.out.println("\u27A3 Correo: "+correo);
	System.out.println("\u27A3 telefono: "+telefono);
	System.out.println("\u27A3 Ciudad: "+ciudad);
	System.out.println("\u27A3 País: "+pais);
	System.out.println("\u27A3 C.P: "+cp);
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public int getCp() {
	return cp;
}
public void setCp(int cp) {
	this.cp = cp;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}

public void getDardeBaja(ArrayList<String> password, ArrayList<String> user) {
	Scanner teclado= new Scanner(System.in);
	String desicion = null;
	if(desicion.equalsIgnoreCase("dar de baja")) {
		
	}
	
}
public String [][]incluirClientes(String matriz[][],String nombre,String apellido, String correo, String pais, String ciudad, int telefono, int cp,
		String dni){
	
	String matrizNueva[][] = new String[matriz.length + 1][8];
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			// en la nueva va la anterior
			matrizNueva[i][j] = matriz[i][j];
		}
	}
	
	matrizNueva[matrizNueva.length - 1][0] = this.nombre;
	matrizNueva[matrizNueva.length - 1][1] = this.apellido;

	matrizNueva[matrizNueva.length - 1][2] = this.dni;
	
	
	
	matrizNueva[matrizNueva.length - 1][3] = this.ciudad;
	String codigopostal=String.valueOf(this.cp);
	matrizNueva[matrizNueva.length - 1][4] = codigopostal;
	matrizNueva[matrizNueva.length - 1][5] = this.pais;
	String tel=String.valueOf(this.telefono);
	matrizNueva[matrizNueva.length - 1][6] = tel;
	matrizNueva[matrizNueva.length - 1][7] = this.correo;
	
	return matrizNueva;
}
public void getEscribirFichero() {
	String ruta= "tableconvert_csv_0xo8do.csv";
	
String [][] matriz=usuario.getLectura_especial_clientes(ruta);

usuario.getPintarMatriz(matriz);

//usuario.getescribirenFichero(ruta, incluirClientes(matriz));
}

}
