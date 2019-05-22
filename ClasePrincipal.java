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
public class ClasePrincipal {
    public static void main(String[] args) {
       
       /* o.setMarca("HP");
        o.setModelo("i3444");
        o.setPrecio(299.99);*/
        Microprocesador m=new Microprocesador();
        m.setMarca("Intel");
        m.setNumero_bits(64);
        //o.setMicro(m);
         Ordenador o=new Ordenador("HP", "Pavilion", 299.99, m);
        
        
        System.out.println("Ordenador: "+o.toString());
        
                
    }
}
