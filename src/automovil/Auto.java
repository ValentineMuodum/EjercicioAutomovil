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
public class Auto {
    private Llanta[] LLantas=new Llanta[4];
    private Motor motor=new Motor();
    private Chasis chasis=new Chasis();

    public Auto(Llanta[] Llantas,Motor motor ) {
        this.LLantas=Llantas;
        this.motor=motor;
        Chasis chasis=new Chasis();
    }

    public Llanta[] getLLantas() {
        return LLantas;
    }

    public void setLLantas(Llanta[] LLantas) {
        this.LLantas = LLantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    

   
    
    
    
}
