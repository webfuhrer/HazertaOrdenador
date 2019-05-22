/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.mediamarkt;

/**
 *
 * @author Admin
 */
//Java Bean o POJO
public class Ordenador {
    private String marca, modelo;
    private double precio;
    private Microprocesador micro;

    public Ordenador(String marca, String modelo, double precio, Microprocesador micro) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.micro = micro;
    }
    
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Microprocesador getMicro() {
        return micro;
    }

    public void setMicro(Microprocesador micro) {
        this.micro = micro;
    }

    @Override
    public String toString() {
        String aux="Marca: "+marca+" Modelo:"+
                modelo+" Precio: "+precio+
                "MICROPROCESADOR: "
                +micro.getMarca()+" "
                +micro.getNumero_bits();
        return aux; //To change body of generated methods, choose Tools | Templates.
    }
    
}
