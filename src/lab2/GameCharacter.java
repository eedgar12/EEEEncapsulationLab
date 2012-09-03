/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Toshiba laptop
 */
public class GameCharacter {
    private String name;
    private int currentSpace = 0;
    
    GameCharacter(){
        
    }
    
    GameCharacter(String name){
        this.setName(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void move(GameBoard space){
        GameDie die = new GameDie();
        die.roll();
        
    }
    
    public int getCurrentSpace(){
         return currentSpace;
     }
}
