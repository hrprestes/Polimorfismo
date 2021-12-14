
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrprestes
 */
public class Polimorfismo {
   
    public static void main(String[] args) {
     /*   DecimalFormat f = new DecimalFormat("#.#");
        Calculadora calc = new Calculadora ();
    
         System.out.println((f.format(calc.somar(1.5, 4.5))));
           */
     Gato gato = new Gato();
     gato.comunicar();
     
     Cachorro dog = new Cachorro();
     dog.comunicar();
    }
    
}
