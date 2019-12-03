/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author stefano
 */
public class PlayerController implements KeyListener,ActionListener{
    private int dx;
    private int dy;
    private List<Movable> objs;
    private int  gravitylv= 1;
    Timer gravity=new Timer(15, this);
    
    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public List<Movable> getObjs() {
        return objs;
    }

    public void setObjs(List<Movable> objs) {
        this.objs = objs;
    }
    
    
    
    public PlayerController(List objs){
        this.objs=objs;
        dx=0;
        dy=0;
        gravity.start();
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        
        
        switch(code){
           
            case KeyEvent.VK_LEFT:
                dx=-1;
            break;
            case KeyEvent.VK_RIGHT:
                dx=1;
            break;
            case KeyEvent.VK_UP:
          
                     dy=-12;
                     
                
            break;
                
               
                
        }
           
         
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        switch(code){
           
            case KeyEvent.VK_LEFT:
                dx=0;
            break;
            case KeyEvent.VK_RIGHT:
                dx=0;
            break;
            
        
    }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gravity){
            
            System.out.println(dy);
            
            objs.get(0).move(dx, dy+gravitylv );
            
            if(dy!=gravitylv){
                dy = dy+gravitylv;
                
            }
            
    }
       }
    
}
