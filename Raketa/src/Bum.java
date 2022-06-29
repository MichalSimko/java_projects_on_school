
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristián
 */
public class Bum extends Raketa implements ActionListener {
    Timer c;
    int sirka = 25;
    int vyska= 30;
    public Bum(int x, int y, JFrame rodic) {
        super(x, y, rodic);
        setBounds(x, y, 35, 25);
        c = new Timer(10000, this);
        c.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
    g.setColor(Color.red);
    g.fillRect(getX(), getY(),sirka,vyska);
    rodic.repaint();
    }

    public int getSirka() {
        return sirka;
    }

    
    @Override
    public void posun() {
        
    int r = (int) (-5+Math.random()*10);
    int h = (int) (Math.random()*5);
        setLocation(getX()-r, getY()- h);
        sirka -=1;
        vyska -= 1;
        
        if(sirka<0){
            c.stop();
            rodic.remove(this);
            }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e); 
        posun();}
    
    
    
}
