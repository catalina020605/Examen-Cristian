import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
	ArrayList<String>listaTrabajador;
	
	String nombre, documento;
	double salarioAnual, vivienda, transporte, ahorro,restante;
	
	ModeloDatos miDato;
	
	public void Iniciar () {
		miDato = new ModeloDatos();
		IngresoDatos();
	}
	
	public void IngresoDatos() {
		String opcion;
		do {
			listaTrabajador = new ArrayList<String>();
			
			nombre = JOptionPane.showInputDialog("Ingrese su nombre, por favor");
			documento = JOptionPane.showInputDialog("Ingrese su numero de documento");
			salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario anual"));
			
			listaTrabajador.add(documento);
			listaTrabajador.add(nombre);
			listaTrabajador.add(salarioAnual+"");
			
			miDato.GuardarDatos(listaTrabajador);
			
			procedimiento();
			
			opcion = JOptionPane.showInputDialog("Desea continuar");
		} while (opcion.equalsIgnoreCase("Si"));
		miDato.imprimirMapa();
	}
	
	public void procedimiento () {
		
		listaTrabajador.add(vivienda+"");
		listaTrabajador.add(transporte+"");
		listaTrabajador.add(ahorro+"");
		
		if (salarioAnual >= 50.0000) {

			vivienda = salarioAnual * 0.30;
			transporte = salarioAnual * 0.20;
			ahorro = salarioAnual * 0.15;
			
			restante = (vivienda+transporte+ahorro)-salarioAnual;
			
		} else {
			JOptionPane.showConfirmDialog(null, "No podra hacer el ahorro debido");
		}
		imprimir();
	}
	
	public void imprimir () {
		JOptionPane.showMessageDialog(null, "Señor (a) "+nombre+
											"\n identificada con: C.C "+documento+
											"\n Su salario anual es de "+salarioAnual+
											"\n su ahorro para vivienda es de "+vivienda+
											"\n su ahorro para transporte es de "+transporte+
											"\n su ahorro es de "+ahorro+
											" \n y su restante es de "+restante);
	}
}
