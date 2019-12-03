/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


import java.awt.Rectangle;

import java.util.List;
import javax.swing.SwingWorker;

/**
 *
 * @author stefano
 */
public class CollisionController extends SwingWorker {

    private List<Character> subjects;
    private List<SolidObject> objs;

    public List<Character> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Character> subjects) {
        this.subjects = subjects;
    }

    public List<SolidObject> getObjs() {
        return objs;
    }

    public void setObjs(List<SolidObject> objs) {
        this.objs = objs;
    }

    public CollisionController(List subjects, List objs) {
        this.subjects = subjects;
        this.objs = objs;

    }

    public void checkCollision() {
        
        for (Character subject : subjects) {
            
            Rectangle subjectHitBox = subject.getHitbox();
            Collision collision = new Collision(subject, null, false, false, false, false);
            for (SolidObject object : objs) {
                
                
                Rectangle objHitBox = object.getHitbox();
                if (subjectHitBox.intersects(objHitBox)) {
                    collision.setObject(object);
                    collision.setSubject(subject);

                    if (subjectHitBox.x < objHitBox.x && subjectHitBox.y > objHitBox.y &&  subjectHitBox.y < objHitBox.y + objHitBox.height ) {
                        collision.setRigth(true);
                    }
                    if (subjectHitBox.x > objHitBox.x && subjectHitBox.y > objHitBox.y &&  subjectHitBox.y < objHitBox.y + objHitBox.height ) {
                        collision.setLeft(true);
                    }
                    if (subjectHitBox.y > objHitBox.y) {
                        collision.setTop(true);
                    }
                    if (subjectHitBox.y < objHitBox.y) {
                        collision.setDown(true);
                    }

                    subject.setCollision(collision);
                    object.setCollision(collision);
                } 
                //System.out.println(collision);
               

            }
            if(collision.getObject()==null){
                subject.setCollision(collision);
            }
        }
    }

    @Override
    protected Object doInBackground() throws Exception {
        while (true) {
            Thread.sleep(10);
            checkCollision();
        }
    }

}
