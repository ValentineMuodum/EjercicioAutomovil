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
public class Motor {
    private String modelo;
    private int Cilindraje;

    public Motor(String modelo, int Cilindraje) {
        this.modelo = modelo;
        this.Cilindraje = Cilindraje;
    }

    public Motor() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }
    
    
    
}
