
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Masozravec extends Zviera{
    private String Maso;
    private String Z;
    private String Farb;
    private String Zv;    

    public Masozravec(int x, int y, JFrame rodic, String iZver, String iZvuk, String iFarba, String iMaso) {
        super(x, y, rodic, iZver, iZvuk, iFarba);
        setBounds(x,y,100,100);
        iMaso=Maso;
        Z=iZver;
        Farb=iFarba;
        Zv=iZvuk;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        vykresli(g);
    }
    
    public void vykresli(Graphics g){
        if(Farb.equals("Zelena"))g.setColor(Color.green);
        if(Farb.equals("Zlta"))g.setColor(Color.yellow);
        if(Farb.equals("Cierna"))g.setColor(Color.black);
        if(Farb.equals("Modra"))g.setColor(Color.blue);
        if(Farb.equals("Cervena"))g.setColor(Color.red);
        if(Farb.equals("Ruzova"))g.setColor(Color.pink);
        g.drawString(Z, 10, 10);
    }
    
    public void posunsa() {
        int x = (int)(-25+Math.random()*50); 
        int y = (int)(-25+Math.random()*50); 
        setLocation(getX()+x/2, getY()+y/2);
        repaint(); 
    }
    
    public void zmenSmer() {
        setLocation(100, getY());
        repaint();
    }
    
    
    
        @Override
    public void actionPerformed(ActionEvent ae) {
        posunsa();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        JOptionPane.showMessageDialog(null, Zv);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }    
    
}
