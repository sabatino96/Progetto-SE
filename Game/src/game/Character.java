/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author stefano
 */
public class Character extends SolidObject implements Drawable,Movable{

    public Character(Point position, int width, int heigth, String id, boolean isVisible) {
        super(position, width, heigth, id, isVisible);
        super.setCollision(new Collision(this,null,false,false,false,false));
    }

    

    public synchronized int  getHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public synchronized void setHealth(int health) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized Rectangle getDraw() {
       return this.getHitbox();
    }

    @Override
    public synchronized void move(int dx, int dy) {
        //System.out.println(getPosition().x);
        Collision c = this.getCollision();
        if (dx>0 && !c.isRigth() || dx<0 && !c.isLeft() || dx==0){
            getPosition().translate(dx,0);
            System.out.println("CIAO");
            if(dy<0 && !c.isTop() || dy>0 && !c.isDown() ){
                getPosition().translate(0, dy);
             
            }
            
            
        }
           
    }
    
}
