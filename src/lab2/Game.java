/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Toshiba laptop
 */
public class Game {
    GUI gui = new GUI();
    GameDie die = new GameDie();
    GameCharacter player1 = new GameCharacter();
    GameCharacter player2 = new GameCharacter();
    
    private int numOfPlayers;
    
    
    public void startGame(){
        
        
        //While someone has not won yet,
            die.roll();
            //Move
            //gui.displayMove(space);
            //Move
        
    }
    
//    private int getNumOfPlayers(){
//        numOfPlayers = gui.inputNumOfPlayers();
//        return numOfPlayers;
//    }
    
    private void getPlayer1Name(){
        
        //input players names based on the number of players playing
        
        
    }
}
