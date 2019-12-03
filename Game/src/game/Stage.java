/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author stefano
 */
public class Stage extends JPanel implements ActionListener {
    private List<Drawable> objs;
    
    Timer timer=new Timer(20, this);

    public Stage(List<Drawable> objs) {
        this.objs = objs;
        timer.start();
       
        
    }
    
    public void actionPerformed(ActionEvent ev){
    if(ev.getSource()==timer){
      repaint();// this will call at every 1 second
    }
    }
    
    @Override
    public void paintComponent(Graphics g){
      //System.out.println("prova");
        super.paintComponent(g);
    }

    @Override
    public void paint(Graphics g) {
        //System.out.println("prova");
        super.paint(g);
        for(Drawable d: objs){
            Rectangle r = d.getDraw();
            g.drawRect(r.x, r.y, r.width, r.height);
        }
    }
    
    
    
    
    
}
