/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

/**
 *
 * @author Valentine Chimezie
 */
public class Ejecutable {
     public static void main(String[] args) {
        /*
         Se hace uso de una clase auxuliar para ejecutar el main
         con el fin de evitar relaciones de deéndencias generados
         por este mismo si se hiciese en la clase Persona
         */
    Persona usuario=new Persona();
    Llanta llanta1=new Llanta(12,"Goodyear");
    Llanta llanta2=new Llanta(15,"Dunlop");
    Motor motor1=new Motor("Audi",3200);
    Motor motor2=new Motor("BMW",4100); 
    
    Auto auto1=new Auto(llanta1,motor1,3);
    Auto auto2=new Auto(llanta2,motor2,3);
    
    auto1.setNoseriechasis(321243);
    auto2.setNoseriechasis(354365);
    
    usuario.autos[0]=auto1;
    usuario.autos[1]=auto2;
    usuario.listarCarros(usuario.autos);
    
    
    }
}
