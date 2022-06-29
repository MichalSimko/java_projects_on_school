
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
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
public class Zviera extends JComponent implements ActionListener, MouseListener{
    protected JFrame rodic;
    protected String Zver;
    protected String Zvuk;
    protected int Farba;
    protected Timer cas;
    
    public Zviera(int x, int y, JFrame rodic, String iZver, String iZvuk, String iFarba) {
        iZver=Zver;
        iZvuk=Zvuk;
        this.rodic = rodic;
        cas = new Timer(50, this);
        cas.start();
        addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
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
