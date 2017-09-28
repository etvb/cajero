/*
Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo
inicial de 1000 dolares, con el siguiente menú de opciones: 1.- Ingresar dinero
a la cuenta. 2.- Retirar dinero de la cuenta. 3.- Salir
*/
package pats.pkg26.pkg13.cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS2613Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float SALDO_INICIAL = 1000;
        float saldoActual, ingreso, retiro;
        byte opcion;
        
        opcion = Byte.parseByte(JOptionPane.showInputDialog("Realiza una opcio\n"
        + " 1.- Ingresar\n"+
        "2.- Retirar\n" +
        "3.- Salir"));
        
        switch(opcion){
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a INGRESAR"));
                saldoActual = ingreso + SALDO_INICIAL;
                JOptionPane.showMessageDialog(null, "Su saldo es de: " + saldoActual);
                break;
            case 2: 
                retiro  = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a RETIRAR"));
                if (retiro > SALDO_INICIAL ) {
                    JOptionPane.showMessageDialog(null, "Saldo INSUFICIENTE");
                }else{
                saldoActual = SALDO_INICIAL - retiro; 
                JOptionPane.showMessageDialog(null, "Su saldo es: " + saldoActual);
                break;
                }
            case 3:
                break;
            default :
                JOptionPane.showMessageDialog(null, "No existe la opcion");
                break;
        }
       
                
    }
    
}
