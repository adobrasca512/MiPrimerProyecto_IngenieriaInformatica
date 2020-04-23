package ProyectoIngenieria;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class Conf_Iniciosesion {
//public static ArrayList<CuentaNueva>cuentas;
public static Viniciarsesion cuenta;
public static ArrayList<String>cuentas;
public static ArrayList<String>contrasenia;
public static Vcrearcuenta cuentanueva;
public static String scaneousuario="";
public static String scaneocontrasenia="";
 public static String [][] matrizcontras=new String [30][1];
 private Administradortabla tabla;
//ArrayList<CuentaNueva>cuentas=new ArrayList();
/*public int probarPass() {
	scaneousuario=CrearCuenta.txtUsuario.getText();
	scaneocontrasenia=CrearCuenta.passwordField.getText();
	if(scaneousuario.equals(cuenta.user) && scaneocontrasenia.equals(cuenta.contra)) {
		return 1;	
	}
	else {
		return 0;
	}
	
}*/

public int metodoPrincipal() {
	int intentos = 3;
	final int maximos = 4;
	
    // desde aqui controlas el login
    while ( encontrar()==0 && (intentos < maximos && intentos>=0) ) {
        intentos--;
    }
    return intentos;
}
public int encontrar() {
	scaneousuario=cuenta.txtUsuario.getText();
	scaneocontrasenia=cuenta.passwordField.getText();
	int i=encontrado1(scaneousuario);
	int  j=encontrado3(scaneocontrasenia);
	if(i==j ) {
		return 1;
	}
	else {
		return 0;
	}
}


public int encontrado1(String scaneousuario) {
	int i=0;
	int encontrado=-1;
	String posicion="";
	while(encontrado==-1 && i<cuentanueva.usuari.size()) {
		if(cuentanueva.usuari.get(i).equals(scaneousuario)) {
			encontrado = i;
		}
		else {
			encontrado=1;
		}
		//if(cuentanueva.usuari.get(i).contains(scaneousuario)) {
			//encontrado=i;
			
		//}
			i++;
			
	}
	return encontrado;
}
public int encontrado3(String scaneocontrasenia) {
	int i=0;
	int encontrado=-1;
	String posicion =""; 
	while(encontrado==-1 && i<cuentanueva.contras.size()) {
		if(cuentanueva.contras.get(i).equals(scaneocontrasenia)) {
			encontrado=i;
		}
		else {
			encontrado=0;
		}
		//if(cuentanueva.contras.get(i).contains(scaneocontrasenia)) {
		//	encontrado=i;
			
		//}
			i++;
			
	}
	return encontrado;
}
public void Ficheronuevo() {
	String ruta="usuarios-y-contrasenias";
	
	
	try {
		//FileWriter fichero = new FileWriter(ruta);
		// Escribimos linea a linea en el fichero
		 File f = new File(ruta);
		    FileWriter fw = new FileWriter(f);
		    BufferedWriter escritura = new BufferedWriter(fw);
		for (int i = 0; i < cuentanueva.usuari.size(); i++) {
			//for (int j = 0; j < matrizcontras[0].length; j++) {
				//matrizcontras[i][0]=cuentanueva.usuari.get(i);
				//matrizcontras[i][1]=cuentanueva.contras.get(i);
			
			//escritura.write(Integer.toString(cuentanueva.usuari.get(i)));
			//}
			escritura.write("\n");
		}
		escritura.close();
	} catch (Exception ex) {
		System.out.println("Mensaje de la excepción: " + ex.getMessage());
	}
}
}





