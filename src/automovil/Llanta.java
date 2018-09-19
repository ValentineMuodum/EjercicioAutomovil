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
public class Llanta {
    
    private int Pulgadas;
    private String Marca;

    public Llanta(int Pulgadas, String Marca) {
        this.Pulgadas = Pulgadas;
        this.Marca = Marca;
    }

    public Llanta() {
    }
    

    public int getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(int Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
}
