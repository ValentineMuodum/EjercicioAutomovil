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
public class Persona {

    /**
     * @param args the command line arguments
     */
    Auto[]autos=new Auto[2];

   

    
    
    void listarCarros(Auto[] autos){
        for(int i=0;i<autos.length;i++){
            System.out.print("Informacion Del Auto ");
            System.out.println(i+1);
            System.out.println("No Serie del chasis");
            System.out.println(autos[i].getChasis().getNumeroSerie());
            System.out.print("Cilindraje: ");
            System.out.println(autos[i].getMotor().getCilindraje());
            System.out.print("Modelo: ");
            System.out.println(autos[i].getMotor().getModelo());
            System.out.print("Marca de llantas: ");
            Llanta llantas[];
            llantas = new Llanta[4];
            llantas=autos[i].getLLantas();
            System.out.println(llantas[0].getMarca());
            System.out.print("Medida de llantas en pulgadas: ");
            System.out.println(llantas[0].getPulgadas());
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
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
