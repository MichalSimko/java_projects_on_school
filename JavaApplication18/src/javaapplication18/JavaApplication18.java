/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Dávid
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autobus bus = new Autobus();
        bus.nacita(50, 12);
        bus.otvorDvere();
        bus.nastupenie(55);
        bus.zatvorDvere();
        System.out.println(bus.aktualnyStav());
        bus.pohyb(); bus.pridaj(); bus.pridaj(); bus.pridaj();
        System.out.println(bus.aktualnyStav());
        bus.zastav();
        bus.otvorDvere();
        bus.vystupenie(20);
        bus.zatvorDvere();
        System.out.println(bus.aktualnyStav());
    }
    
}
