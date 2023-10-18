import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	String nombre, documento, tipoVendedor;
	double totalVentas,porcentaje,comision;
	
	ModeloDatos miDato;
	
	ArrayList<String> listaVendedores;
	
	public void iniciar() {
		miDato = new ModeloDatos();
		IngresarDatos();
	}

	 void IngresarDatos() {
		 String opcion;
		 do {
			 listaVendedores = new ArrayList<String>();
				
				nombre = JOptionPane.showInputDialog("Ingrese el nombre");
				documento = JOptionPane.showInputDialog("Ingrese el documento");
				tipoVendedor = JOptionPane.showInputDialog("Que tipo de vendedor es: ");
				totalVentas = Double.parseDouble(JOptionPane.showInputDialog("Ingres el total de las ventas"));
				
				listaVendedores.add(documento);
				listaVendedores.add(nombre);
				listaVendedores.add(tipoVendedor);
				listaVendedores.add(totalVentas+"");
				
				opcion = JOptionPane.showInputDialog("Desea continuar");
				Procesamiento();
							
		} while (opcion.equalsIgnoreCase("Si"));
	 }
	public void Procesamiento() {
		
		switch (tipoVendedor) {
		case "A": porcentaje = 0.08;break;
		case "B": porcentaje = 0.06;break;
		case "C": porcentaje = 0.04;break;
		case "D": porcentaje = 0.02;break;
		}
		
		comision = totalVentas * porcentaje;
		mensaje();
	}
	
	public void mensaje() {
		JOptionPane.showMessageDialog(null, "Vendedor (a) "+nombre+
										"\n identificado con "+documento+
										"\n Vendedor tipo: "+tipoVendedor+
										"\n Su comision es de: "+comision);
	}

}