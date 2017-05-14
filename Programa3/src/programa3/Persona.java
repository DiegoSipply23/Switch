/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3;

/**
 *
 * @author Diego
 */
public class Persona {
    
    String nombre;
    int edad;
    String nacionalidad;
    
    //constructor
    public Persona(String nom){
        
        this.nombre = nom;
       
    }
    
    public void caminar(){
        
        System.out.println("La persona" + nombre + " esta caminando");
        
    }
    
    public void enamorarse(){
        
        System.out.println("La persona esta enamorada");
        
    }
    
    public void morir(){
        
        System.out.println("La persona murio");
        
        
    }
}

    
