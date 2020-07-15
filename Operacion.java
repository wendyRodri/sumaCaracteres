
package SumaCaracteres;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hogar
 */
public class Operacion {
    
    String Error = "";
    
    public ArrayList<Integer> Dato(String cadena) {
		String cad = cadena.trim();
		cad = cad.toLowerCase();
		String[] cade = cad.split(",");
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		
		for (int i = 0; i < cade.length; i++) {
			
			if (isNumeric(cade[i]) ) {
				numeros.add(Integer.parseInt(cade[i]));
			}
			else {
				Error += cade[i] + " - ";
			}
		}
		mostraNum(numeros);
		return numeros;
	}
	
	public void mostraNum(ArrayList<Integer> contenedora)
	{
		int suma = 0;
		for (int i = 0; i < contenedora.size(); i++) {
			suma += contenedora.get(i);
		}
		JOptionPane.showMessageDialog(null, "La suma de su Cadena es: " + suma);
		JOptionPane.showMessageDialog(null, "Lo siento, este caracter NO ES NUMERICO : " + Error);
		
	}
	
	
	public int sumar(int x, int y) {
		
		return x + y;
	}

	private boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
    
}
