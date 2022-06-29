/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 * Vytvorte triedu Autobus, ktorá umožní:
pohyb autobusu
zastavenie autobusu
otvorenie dverí
zatvorenie dverí
nastúpenie zadaného počtu cestujúcich
vystúpenie zadaného počtu cestujúcich
zistenie aktuálneho počtu cestujúcich 
zabezpečte príslušné kontroly (napr. nevystupovať cez zatvorené dvere, nedovoliť pohnúť sa kým sú dvere otvorené, nenastupovať ak je autobus plný a pod.

 *
 * @author Dávid
 */
public class Autobus {
    private boolean pohyb = false;
    private int rychlost=0;
    private boolean dvere = false;
    private int kapacita;
    private int pocetCestujucich;

    public void nacita(int ikapacita, int ipocetCestujucich){
        if(ipocetCestujucich>ikapacita){
          ipocetCestujucich=ikapacita;
        } 
        kapacita=ikapacita;
        pocetCestujucich=ipocetCestujucich;   
    }
    
    public void otvorDvere(){
        if(pohyb==false){ 
          dvere=true;
        }
        else System.out.println("Autobus nemôže otvoriť dvere pokým nestojí.");
    }
    
    public void zatvorDvere(){
        dvere=false;
    }
    
    public void vystupenie(int cislo){
        if (dvere){
          if(cislo>pocetCestujucich){
          pocetCestujucich=0;
          } 
          else pocetCestujucich=pocetCestujucich-cislo;
        }
        else System.out.println("Vystúpenie nemožné! Dvere sú zatvorené!");     
    }
    
    public void nastupenie(int cislo){
        
        if(dvere){
          if(pocetCestujucich+cislo>kapacita){
            pocetCestujucich=kapacita;
              System.out.println("Viac cestujúcich sa nezmestilo.");
          }
          else pocetCestujucich=pocetCestujucich+cislo;
        }
        else System.out.println("Nastúpenie nemožné! Dvere sú zatvorené!");
    }
    
    public void pohyb(){
        if(dvere==false){
          pohyb=true;
            System.out.println("Autobus sa pohybuje.");
        } 
    }
    
    public void zastav(){
        if(pohyb){
          pohyb=false;
          rychlost=0;
            System.out.println("Autobus Zastavil.");
        } 
    }
    
    public void pridaj(){
      if(pohyb){
        if(rychlost<130){
            rychlost+=10;
        }
        else System.out.println("Rýchlejšie to nepôjde, predpisy sa musia dodržiavať.");
      }
    }
    
    public void uber(){
      if(pohyb){
        if(rychlost>=0){
            rychlost-=10;
        }
        else {
            System.out.println("Pomenšie ísť neviem. Autobus stojí.");
            rychlost=0;
        }
      }
    }
    
    public String aktualnyStav(){
    
        return "Počet cestujúcich: "+pocetCestujucich+", dvere sú: "+dvere+", pohyb je: "+pohyb;
    }
    
    
} 

