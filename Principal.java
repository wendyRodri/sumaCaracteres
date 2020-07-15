
package SumaCaracteres;

import javax.swing.JOptionPane;

 
public class Principal {
    
    public static void main(String[] args) {
         Operacion p = new Operacion();
         
         String cadena = JOptionPane.showInputDialog("Digite los caracteres seguidos de una ',' ejemplo: '1,2,3,14,5YU,67'");
         
         p.Dato(cadena);
    }
}
