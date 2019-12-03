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
public abstract class SolidObject {
    private Point position;
    private int width;
    private int heigth;
    private String id;
    private boolean isVisible;
    private Collision collision;

    public SolidObject(Point position, int width, int heigth, String id, boolean isVisible) {
        this.position = position;
        this.width = width;
        this.heigth = heigth;
        this.id = id;
        this.isVisible = isVisible;
        this.collision=null;
    }
    
    public synchronized Rectangle getHitbox(){
        return new Rectangle(position.x,position.y,width,heigth);
    }
    
    
    public synchronized  void setCollision(Collision collision){
        this.collision=collision;
    }
    public synchronized Collision getCollision(){
        return collision;
    } 

    public synchronized Point getPosition() {
        return position;
    }

    public synchronized void setPosition(Point position) {
        this.position = position;
    }

    public synchronized int getWidth() {
        return width;
    }

    public synchronized void setWidth(int width) {
        this.width = width;
    }

    public  synchronized int getHeigth() {
        return heigth;
    }

    public synchronized void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public synchronized String getId() {
        return id;
    }

    public synchronized void setId(String id) {
        this.id = id;
    }

    public synchronized boolean isIsVisible() {
        return isVisible;
    }

    public synchronized void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
  
    
}
