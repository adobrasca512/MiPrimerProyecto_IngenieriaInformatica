package ProyectoIngenieria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Devoluciones {
private String productodevuelto;
private String motivo;
private Administradortabla tablaconfiguracion;
private Comprascliente compras;
public Devoluciones(String productodevuelto, String motivo) {
	super();
	this.productodevuelto = productodevuelto;
	this.motivo = motivo;
	this.tablaconfiguracion=tablaconfiguracion;
}
public String getDevolucion() {
	return productodevuelto;
}
public void setDevolucion(String devolucion) {
	this.productodevuelto = devolucion;
}
public String getMotivo() {
	return motivo;
}
public void setMotivo(String motivo) {
	this.motivo = motivo;
}

}
