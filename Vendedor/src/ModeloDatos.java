
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
		
	HashMap<String, ArrayList<String>> mapaVendedores;

	public ModeloDatos() {
		mapaVendedores = new HashMap<String, ArrayList<String>>();
			
	}
	
	 public void guardarDatos(ArrayList<String> listaVendedores) {
			mapaVendedores.put(listaVendedores.get(0), listaVendedores);
			JOptionPane.showMessageDialog(null, "Registro existoso!");
		}
	 
	 public void imprimirMapa() {
			for (String documento:mapaVendedores.keySet()) {
				System.out.println(documento+"-"+mapaVendedores.get(documento));
			}
		}
}
