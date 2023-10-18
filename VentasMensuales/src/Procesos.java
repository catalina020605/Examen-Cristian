import java.util.Scanner;
import javax.swing.JOptionPane;

public class Procesos {

	    public void Datos() {
	        Scanner input = new Scanner(System.in);
	        
	        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses a calcular"));
	        int[] arreglo = new int[n];
	        System.out.println("Ingresa las ventas de cada mes, una por una en consola");
	        for (int i = 0; i < n; i++) {
	            arreglo[i] = input.nextInt();
	        }

	        int ventaMayor = arreglo[0];
	        int ventaMenor = arreglo[0];

	        for (int i = 1; i < n; i++) {
	            if (arreglo[i] > ventaMayor) {
	                ventaMayor = arreglo[i];
	            }
	            if (arreglo[i] < ventaMenor) {
	                ventaMenor = arreglo[i];
	            }
	        }

	        System.out.println("La venta mayor fue de: " + ventaMayor);
	        System.out.println("La venta menor fue de: " + ventaMenor);

	        input.close();
	    }
	}