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
public class block extends SolidObject implements Drawable{

    public block(Point position, int width, int heigth, String id, boolean isVisible) {
        super(position, width, heigth, id, isVisible);
    }

    @Override
    public synchronized Rectangle getDraw() {
        return getHitbox(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
