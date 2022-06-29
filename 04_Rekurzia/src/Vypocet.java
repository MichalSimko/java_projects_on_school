/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Vypocet {
    
    public int faktorial(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        else return n*faktorial(n-1);
    }
    
    public int postupnost_v1(int n) {
        if(n==1) return 1;
        else return 3+postupnost_v1(n-1);
    }
    
    public int postupnost_v2(int n) {
        int vysledok = 0;
        if(n==1) vysledok = 1;   
        else vysledok = postupnost_v2(n-1)*3;
        return vysledok;        
    }
    
    public int fibonachi(int n) {
        if(n==1) return 1;
        if(n==2) return 1;
        if(n>2) return fibonachi(n-1)+fibonachi(n-2);
        else return 0;
    }
    
    public int mocnina(int x, int n) {
        if(n==0) return 1;
        if(n==1) return x;
        else return x*mocnina(x,n-1);
    }
    
}
