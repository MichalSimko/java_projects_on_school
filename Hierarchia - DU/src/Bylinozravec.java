
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Bylinozravec extends Zviera{
    private String Bylin;
    private String Z;
    private String Farb;
    private int pom=-1;
    private String Zv;


    public Bylinozravec(int x, int y, JFrame rodic, String iZver, String iZvuk, String iFarba, String iBylin) {
        super(x, y, rodic, iZver, iZvuk, iFarba);
        setBounds(x,y,100,100);
        iBylin=Bylin;
        Z=iZver;
        Farb=iFarba;
        Zv=iZvuk;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(Farb.equals("Zelena"))g.setColor(Color.green);
        if(Farb.equals("Zlta"))g.setColor(Color.yellow);
        if(Farb.equals("Cierna"))g.setColor(Color.black);
        if(Farb.equals("Modra"))g.setColor(Color.blue);
        if(Farb.equals("Cervena"))g.setColor(Color.red);
        if(Farb.equals("Ruzova"))g.setColor(Color.pink);
        g.drawString(Z, 10, 10);
    }  
    
    public void posunsa() {
        if(pom>200)pom=-1;
        if(pom<50){setLocation(getX(), getY()+5);pom+=5;}
        if(pom>50&&pom<150){setLocation(getX(), getY()-5);pom+=5;}
        if(pom>150&&pom<200){setLocation(getX(), getY()+5);pom+=5;}    
        repaint(); 
    }
    
    public void zmenSmer() {
        setLocation(getX(), 200);
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
