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
public class Weapon extends SolidObject{
    private int rateo;
    private Bullet bullet;

    public Weapon(Point position, int width, int heigth, String id, boolean isVisible,int rateo,Bullet bullet) {
        super(position, width, heigth, id, isVisible);
        this.bullet=bullet;
        this.rateo=rateo;
        System.out.println("p");
                
    }

    
    
    public void Shoot(Direction direction){
       /* if(direction== LEFT)
            bullet.move(direction);
        else if (direction == RIGTH)
            bullet.move(direction);
        */
    }

    public int getRateo() {
        return rateo;
    }

    public void setRateo(int rateo) {
        this.rateo = rateo;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public void setCollision(Collision collision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
