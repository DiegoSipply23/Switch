/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.pkg2;

/**
 *
 * @author Diego
 */

//Clase principal
public class Main {

    /**
     * @param args the command line arguments
     */
    //metodo main (metodo que se ejecuta primero que todo)
    public static void main(String[] args) {
        
        Automoviles ferrari = new Automoviles();
    
        ferrari.encender();
        ferrari.avanzar();
        ferrari.apagar();
    
    }
    
}
