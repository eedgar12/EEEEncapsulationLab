/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;

/**
 *
 * @author Toshiba laptop
 */
public class GameDie {
    GUI gui = new GUI();
    
    private int rollNum;

    public int getRollNum() {
        return rollNum;
    }

    private void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    
    
    public int roll(){
        Random randRoll = new Random();
        setRollNum(randRoll.nextInt(6) + 1);
        gui.move(getRollNum());
        return getRollNum(); 
        
    }
}
