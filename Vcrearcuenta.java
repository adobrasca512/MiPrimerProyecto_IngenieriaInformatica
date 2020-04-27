package ProyectoIngenieria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.util.*;

public class Vcrearcuenta extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField correo;
	private JTextField codigopostal;
	private JTextField telefono;
	private JTextField usuario;
	private JTextField contrasena;
	private String[][] matrizcontras = new String[30][2];
	private JTextField dni;
	private JTextField ciudad;
	private JTextField pais;
	private JButton btnEntrar = new JButton("Entrar");
	private String nombres;
	private String apellidos;
	private String correos;
	private String telefonos;
	private String cp;
	private String ciudades;
	private String paises;
	private String identificacion;

	public JTextField getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(JTextField codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreos() {
		return correos;
	}

	public void setCorreos(String correos) {
		this.correos = correos;
	}

	public String getTelefonos() {

		return telefonos;
	}

	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCiudades() {
		return ciudades;
	}

	public void setCiudades(String ciudades) {
		this.ciudades = ciudades;
	}

	public String getPaises() {
		return paises;
	}

	public void setPaises(String paises) {
		this.paises = paises;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Vcrearcuenta() {

		this.setLocation(400, 220);// esto me ajusta para que sea centrado
		setResizable(false);// no se maximise el diseño
		setTitle("Crear Cuenta");// permite poner nombre a la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNombre.setBounds(18, 60, 61, 16);
		contentPane.add(lblNombre);

		nombre = new JTextField();
		nombre.setBounds(91, 55, 130, 26);
		contentPane.add(nombre);
		nombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblApellido.setBounds(241, 60, 61, 16);
		contentPane.add(lblApellido);

		apellido = new JTextField();
		apellido.setBounds(314, 55, 130, 26);
		contentPane.add(apellido);
		apellido.setColumns(10);

		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCorreo.setBounds(18, 95, 61, 16);
		contentPane.add(lblCorreo);

		correo = new JTextField();
		correo.setBounds(91, 90, 130, 26);
		contentPane.add(correo);
		correo.setColumns(10);

		JLabel lblCp = new JLabel("CP:");
		lblCp.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCp.setBounds(18, 125, 61, 16);
		contentPane.add(lblCp);

		codigopostal = new JTextField();
		codigopostal.setBounds(91, 128, 130, 26);
		contentPane.add(codigopostal);
		codigopostal.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTelefono.setBounds(241, 95, 61, 16);
		contentPane.add(lblTelefono);

		telefono = new JTextField();
		telefono.setBounds(314, 90, 130, 26);
		contentPane.add(telefono);
		telefono.setColumns(10);

		JLabel lblCrearCuenta = new JLabel("Crear Cuenta");
		lblCrearCuenta.setFont(new Font("Superclarendon", Font.PLAIN, 19));
		lblCrearCuenta.setBounds(149, 6, 153, 26);
		contentPane.add(lblCrearCuenta);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUsuario.setBounds(18, 207, 61, 16);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contraseña:");

		lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblContrasea.setBounds(241, 207, 84, 16);
		contentPane.add(lblContrasea);

		usuario = new JTextField();
		usuario.setBounds(91, 202, 130, 26);
		contentPane.add(usuario);
		usuario.setColumns(10);

		contrasena = new JTextField();
		contrasena.setBounds(314, 202, 130, 26);
		contentPane.add(contrasena);
		contrasena.setColumns(10);

		// CrearCuenta window1= new CrearCuenta();
		JButton btnEntrar = new JButton("Entrar");

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Viniciarsesion window1 = new Viniciarsesion();
				String user = usuario.getText();
				String contra = contrasena.getText();
				nombres = nombre.getText();
				apellidos = apellido.getText();
				correos = correo.getText();
				telefonos = telefono.getText();
				cp = codigopostal.getText();
				identificacion = dni.getText();
				paises = pais.getText();
				ciudades = ciudad.getText();
				//Micuenta cuenta = new Micuenta();
				DatosCliente clientesinfo = new DatosCliente(nombres, apellidos, correos, ciudades, paises,
						Integer.parseInt(telefonos), Integer.parseInt(cp), identificacion);

				Administradortabla prueba = new Administradortabla();
				String ruta = "tableconvert_csv_0xo8do.csv";

				String matriz[][] = prueba.getlectura_csv(ruta);
				prueba.getPintarMatriz(matriz);
				prueba.getPintarMatriz(clientesinfo.incluirClientes(matriz, nombres, apellidos, correos, ciudades,
						paises, Integer.parseInt(telefonos), Integer.parseInt(cp), identificacion));
				prueba.getescribirenFichero(ruta, clientesinfo.incluirClientes(matriz, nombres, apellidos, correos,
						ciudades, paises, Integer.parseInt(telefonos), Integer.parseInt(cp), identificacion));

				String rutas = "fichero-de-cuentasyusuarios.txt";
				String[][] matrizNueva = prueba.getlectura_csv(rutas);

				// le di un tamaño al fichero
				// String[][] matriz = new String[30][2];
				// Realizo la escritura del fichero para que añada a los usuarios
				String matriz2[][] = new String[matrizNueva.length + 1][2];

				for (int i = 0; i < matrizNueva.length; i++) {
					for (int j = 0; j < matrizNueva[0].length; j++) {
						// en la nueva va la anterior
						matriz2[i][j] = matrizNueva[i][j];
					}
				}

				matriz2[matriz2.length - 1][0] = usuario.getText();
				matriz2[matriz2.length - 1][1] = contrasena.getText();
				prueba.addFila();
				prueba.getescribirenFichero(rutas, matriz2);

				window1.setVisible(true);
				dispose();

			}
		});
		btnEntrar.setBounds(324, 235, 117, 29);
		contentPane.add(btnEntrar);

		JLabel lblDni = new JLabel("Dni:");
		lblDni.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDni.setBounds(241, 133, 61, 16);
		contentPane.add(lblDni);

		dni = new JTextField();
		dni.setBounds(314, 128, 130, 26);
		contentPane.add(dni);
		dni.setColumns(10);

		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCiudad.setBounds(18, 165, 61, 16);
		contentPane.add(lblCiudad);

		ciudad = new JTextField();
		ciudad.setBounds(91, 164, 130, 26);
		contentPane.add(ciudad);
		ciudad.setColumns(10);

		JLabel lblPas = new JLabel("País:");
		lblPas.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPas.setBounds(241, 165, 61, 16);
		contentPane.add(lblPas);

		pais = new JTextField();
		pais.setBounds(314, 169, 130, 26);
		contentPane.add(pais);
		pais.setColumns(10);

	}


}
