
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
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
public class Raketa extends JComponent implements ActionListener {
    private Timer t;
    JFrame rodic;
   
    
    
    boolean y =true;
    
    boolean x = false;
   
    public Raketa(int x, int y, JFrame rodic ) {
        setBounds(x, y, 100,170);
        t = new Timer(100,this);
        t.start();
        this.rodic = rodic;
        setFocusable(true);
        
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
     ImageIcon icon = new ImageIcon("rocket.png");
        icon.paintIcon(this, g, 0, 10);
        
        if(y== false){
            
        
            g.drawString("BOOOOM!!", 0, 15);
        ImageIcon icon1 = new ImageIcon("bo.png");
        icon1.paintIcon(this, g, 0, 10);
         
           // rodic.remove(this);
        }
            
        
    }
    
    
    public void posun(){
        if(getY()<=rodic.getY()) { x = true;}
        if(x == false)setLocation(getX(),getY()-5);
     if(x== true) { 
       if(getY()>rodic.getHeight()-180) {t.stop(); y = false;
       Bum b1 = new Bum(getX(), getY(), rodic);
       rodic.add(b1);
       Bum b2 = new Bum(getX()+16, getY()+2, rodic);
       rodic.add(b2);
       Bum b3 = new Bum(getX()+80, getY()+30, rodic);
       rodic.add(b3);
           setBounds(getX(), getY(), 0, 0);
       
       rodic.repaint();}
       else setLocation(getX(), getY()+5);
     }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        posun(); 
  
    }
    
    
    
    
    
}
