
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComboBox;
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
 * @author Dominik
 */
public class zoo extends JComponent implements ActionListener, MouseListener {

    public JFrame rodic;
    public int farba;
    public String tekst;
    public int druh;
    public Timer timer;
    public int check = 0;
    public int TY;
    public int TX;
    public String zvuk;
    
    
    

    public zoo(int x, int y, String tekst, JFrame rodic, int farba, int druhH, String zvuk) {

        setBounds(x, y, 200, 200);
        this.rodic = rodic;
        this.tekst = tekst;
        this.farba = farba;
       druh = druhH;
        this.TY = y;
        this.TX = x;
        this.zvuk = zvuk;

        this.timer = new Timer(50, this);
        timer.start();
        
        addMouseListener(this);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (farba == 0) {
            g.setColor(Color.black);
        }
        if (farba == 1) {
            g.setColor(Color.green);
        }
        if (farba == 2) {
            g.setColor(Color.yellow);
        }
        if (farba == 3) {
            g.setColor(Color.blue);
        }

        g.drawString(tekst, 100, 100);

        repaint();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(druh==2){
        if (check == 0) {
            setBounds(getX(), getY() + 2, 200, 200);
        }
        if (check == 1) {
            setBounds(getX(), getY() - 2, 200, 200);
        }

        if (getY() > TY + 50) {
            check = 1;
        }
        if (getY() > 331) {
            check = 1;
        }
        if (check == 1) {
            if (getY() < TY - 50) {
                check = 0;
            }

        }

    }
        if(druh==1) {
            
            int x = (int) (-5 + Math.random() * 11);
            int y = (int) (-5 + Math.random() * 11);
            setLocation(getX()+x, getY()+y);
            
            if(getY() > 200) { setLocation(getX(), TY); }
            if(getY() > TY + 50) { setLocation(getX(), getY()-2); }
            if(getX() > TX + 50) { setLocation(getX() -2, getY()); }
        
        
        
        
        }
}
    
    public void zmenSmer() {
        if(druh == 2)
        {
           TY = 100;
           setLocation(getX(), TY);
        }
        if(druh == 1)
        {
           setLocation(200, getY());
        }
        repaint();
    }
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {

        JOptionPane.showMessageDialog(null, zvuk);
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
