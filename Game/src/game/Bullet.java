/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Point;

/**
 *
 * @author stefano
 */
public class Bullet extends SolidObject implements Movable{

    public Bullet(Point position, int width, int heigth, String id, boolean isVisible) {
        super(position, width, heigth, id, isVisible);
    }
    
    

    @Override
    public void setCollision(Collision collision) {
        if(collision.getSubject().getId().equals("enemy")){
            int health = collision.getSubject().getHealth();
            collision.getSubject().setHealth(health-1);
        }
    }
    
    public void move(int dx, int dy){
        getPosition().translate(dx, dy);
        
        
    }
    
    
}
