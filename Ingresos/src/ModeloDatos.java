import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
		HashMap<String, ArrayList<String>>MapaTrabajadores;
		
		public ModeloDatos() {
			MapaTrabajadores = new HashMap<String, ArrayList<String>>();
		}
		
		public void GuardarDatos(ArrayList<String>listaTrabajador) {
			MapaTrabajadores.put(listaTrabajador.get(0), listaTrabajador);
			JOptionPane.showMessageDialog(null, "Registro exitoso");
		}
		
		public int getSizeMap() {
	           return MapaTrabajadores.size(); 
	      }
		
		public void imprimirMapa() {
			for (String documento:MapaTrabajadores.keySet()) {
				System.out.println(documento+"-"+MapaTrabajadores.get(documento));
			}
		}
}
